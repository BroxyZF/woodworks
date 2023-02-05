package com.teamabnormals.woodworks.core;

import com.google.common.collect.ImmutableList;
import com.teamabnormals.blueprint.core.util.DataUtil;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import com.teamabnormals.woodworks.core.data.client.WoodworksBlockStateProvider;
import com.teamabnormals.woodworks.core.data.client.WoodworksLanguageProvider;
import com.teamabnormals.woodworks.core.data.server.WoodworksLootTableProvider;
import com.teamabnormals.woodworks.core.data.server.WoodworksRecipeProvider;
import com.teamabnormals.woodworks.core.data.server.WoodworksStructureRepaletterProvider;
import com.teamabnormals.woodworks.core.data.server.tags.WoodworksBlockTagsProvider;
import com.teamabnormals.woodworks.core.data.server.tags.WoodworksItemTagsProvider;
import com.teamabnormals.woodworks.core.other.WoodworksClientCompat;
import com.teamabnormals.woodworks.core.other.WoodworksCompat;
import com.teamabnormals.woodworks.core.registry.WoodworksMenuTypes;
import com.teamabnormals.woodworks.core.registry.WoodworksRecipes;
import com.teamabnormals.woodworks.core.registry.WoodworksRecipes.WoodworksRecipeSerializers;
import com.teamabnormals.woodworks.core.registry.WoodworksRecipes.WoodworksRecipeTypes;
import com.teamabnormals.woodworks.core.registry.helper.WoodworksBlockSubRegistryHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Woodworks.MOD_ID)
public class Woodworks {
	public static final String MOD_ID = "woodworks";
	public static final RegistryHelper REGISTRY_HELPER = RegistryHelper.create(MOD_ID, helper -> helper.putSubHelper(ForgeRegistries.BLOCKS, new WoodworksBlockSubRegistryHelper(helper)));

	public static final RecipeBookType RECIPE_TYPE_SAWING = RecipeBookType.create("SAWING");

	public Woodworks() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext context = ModLoadingContext.get();
		MinecraftForge.EVENT_BUS.register(this);

		REGISTRY_HELPER.register(bus);
		WoodworksMenuTypes.MENU_TYPES.register(bus);
		WoodworksRecipeSerializers.RECIPE_SERIALIZERS.register(bus);
		WoodworksRecipeTypes.RECIPE_TYPES.register(bus);

		bus.addListener(this::commonSetup);
		bus.addListener(this::clientSetup);
		bus.addListener(this::dataSetup);

		bus.addGenericListener(Block.class, this::registerConfigConditions);

		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
			bus.addListener(this::registerCategories);
		});

		context.registerConfig(ModConfig.Type.COMMON, WoodworksConfig.COMMON_SPEC);
	}

	private void registerConfigConditions(RegistryEvent.Register<Block> event) {
		DataUtil.registerConfigCondition(Woodworks.MOD_ID, WoodworksConfig.COMMON);
	}

	private void commonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WoodworksCompat.register();
		});
	}

	private void clientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			WoodworksClientCompat.register();
			WoodworksMenuTypes.registerScreens();
		});
	}

	private void dataSetup(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper fileHelper = event.getExistingFileHelper();

		if (event.includeServer()) {
			WoodworksBlockTagsProvider blockTags = new WoodworksBlockTagsProvider(generator, fileHelper);
			generator.addProvider(blockTags);
			generator.addProvider(new WoodworksItemTagsProvider(generator, blockTags, fileHelper));
			generator.addProvider(new WoodworksLootTableProvider(generator));
			generator.addProvider(new WoodworksRecipeProvider(generator));
			generator.addProvider(new WoodworksStructureRepaletterProvider(generator));
		}

		if (event.includeClient()) {
			generator.addProvider(new WoodworksBlockStateProvider(generator, fileHelper));
			generator.addProvider(new WoodworksLanguageProvider(generator));
		}
	}

	public void registerCategories(RegisterRecipeBookCategoriesEvent event) {
		event.registerBookCategories(Woodworks.RECIPE_TYPE_SAWING, ImmutableList.of(WoodworksRecipes.SAWING.get()));
	}
}