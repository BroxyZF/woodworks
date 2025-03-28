package com.teamabnormals.woodworks.core.data.server.tags;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import com.teamabnormals.woodworks.core.Woodworks;
import com.teamabnormals.woodworks.core.registry.WoodworksBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class WoodworksBlockTagsProvider extends BlockTagsProvider {

	public WoodworksBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Woodworks.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		this.tag(BlockTags.BEEHIVES).add(WoodworksBlocks.SPRUCE_BEEHIVE.get(), WoodworksBlocks.BIRCH_BEEHIVE.get(), WoodworksBlocks.JUNGLE_BEEHIVE.get(), WoodworksBlocks.ACACIA_BEEHIVE.get(), WoodworksBlocks.DARK_OAK_BEEHIVE.get(), WoodworksBlocks.MANGROVE_BEEHIVE.get(), WoodworksBlocks.CRIMSON_BEEHIVE.get(), WoodworksBlocks.WARPED_BEEHIVE.get());
		this.tag(BlockTags.CLIMBABLE).add(WoodworksBlocks.SPRUCE_LADDER.get(), WoodworksBlocks.BIRCH_LADDER.get(), WoodworksBlocks.JUNGLE_LADDER.get(), WoodworksBlocks.ACACIA_LADDER.get(), WoodworksBlocks.DARK_OAK_LADDER.get(), WoodworksBlocks.MANGROVE_LADDER.get(), WoodworksBlocks.CRIMSON_LADDER.get(), WoodworksBlocks.WARPED_LADDER.get());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(WoodworksBlocks.SAWMILL.get());
		this.tag(BlockTags.MINEABLE_WITH_AXE).add(WoodworksBlocks.OAK_BOARDS.get(), WoodworksBlocks.SPRUCE_BOARDS.get(), WoodworksBlocks.BIRCH_BOARDS.get(), WoodworksBlocks.JUNGLE_BOARDS.get(), WoodworksBlocks.ACACIA_BOARDS.get(), WoodworksBlocks.DARK_OAK_BOARDS.get(), WoodworksBlocks.MANGROVE_BOARDS.get(), WoodworksBlocks.CRIMSON_BOARDS.get(), WoodworksBlocks.WARPED_BOARDS.get(), WoodworksBlocks.SPRUCE_BOOKSHELF.get(), WoodworksBlocks.BIRCH_BOOKSHELF.get(), WoodworksBlocks.JUNGLE_BOOKSHELF.get(), WoodworksBlocks.ACACIA_BOOKSHELF.get(), WoodworksBlocks.DARK_OAK_BOOKSHELF.get(), WoodworksBlocks.MANGROVE_BOOKSHELF.get(), WoodworksBlocks.CRIMSON_BOOKSHELF.get(), WoodworksBlocks.WARPED_BOOKSHELF.get(), WoodworksBlocks.SPRUCE_LADDER.get(), WoodworksBlocks.BIRCH_LADDER.get(), WoodworksBlocks.JUNGLE_LADDER.get(), WoodworksBlocks.ACACIA_LADDER.get(), WoodworksBlocks.DARK_OAK_LADDER.get(), WoodworksBlocks.MANGROVE_LADDER.get(), WoodworksBlocks.CRIMSON_LADDER.get(), WoodworksBlocks.WARPED_LADDER.get(), WoodworksBlocks.SPRUCE_BEEHIVE.get(), WoodworksBlocks.BIRCH_BEEHIVE.get(), WoodworksBlocks.JUNGLE_BEEHIVE.get(), WoodworksBlocks.ACACIA_BEEHIVE.get(), WoodworksBlocks.DARK_OAK_BEEHIVE.get(), WoodworksBlocks.MANGROVE_BEEHIVE.get(), WoodworksBlocks.CRIMSON_BEEHIVE.get(), WoodworksBlocks.WARPED_BEEHIVE.get(), WoodworksBlocks.OAK_CHEST.get(), WoodworksBlocks.SPRUCE_CHEST.get(), WoodworksBlocks.BIRCH_CHEST.get(), WoodworksBlocks.JUNGLE_CHEST.get(), WoodworksBlocks.ACACIA_CHEST.get(), WoodworksBlocks.DARK_OAK_CHEST.get(), WoodworksBlocks.MANGROVE_CHEST.get(), WoodworksBlocks.CRIMSON_CHEST.get(), WoodworksBlocks.WARPED_CHEST.get(), WoodworksBlocks.OAK_TRAPPED_CHEST.get(), WoodworksBlocks.SPRUCE_TRAPPED_CHEST.get(), WoodworksBlocks.BIRCH_TRAPPED_CHEST.get(), WoodworksBlocks.JUNGLE_TRAPPED_CHEST.get(), WoodworksBlocks.ACACIA_TRAPPED_CHEST.get(), WoodworksBlocks.DARK_OAK_TRAPPED_CHEST.get(), WoodworksBlocks.MANGROVE_TRAPPED_CHEST.get(), WoodworksBlocks.CRIMSON_TRAPPED_CHEST.get(), WoodworksBlocks.WARPED_TRAPPED_CHEST.get());
		this.tag(BlockTags.MINEABLE_WITH_HOE).add(WoodworksBlocks.OAK_LEAF_PILE.get(), WoodworksBlocks.SPRUCE_LEAF_PILE.get(), WoodworksBlocks.BIRCH_LEAF_PILE.get(), WoodworksBlocks.JUNGLE_LEAF_PILE.get(), WoodworksBlocks.ACACIA_LEAF_PILE.get(), WoodworksBlocks.DARK_OAK_LEAF_PILE.get(), WoodworksBlocks.MANGROVE_LEAF_PILE.get(), WoodworksBlocks.AZALEA_LEAF_PILE.get(), WoodworksBlocks.FLOWERING_AZALEA_LEAF_PILE.get());
		this.tag(BlockTags.GUARDED_BY_PIGLINS).add(WoodworksBlocks.OAK_CHEST.get(), WoodworksBlocks.SPRUCE_CHEST.get(), WoodworksBlocks.BIRCH_CHEST.get(), WoodworksBlocks.JUNGLE_CHEST.get(), WoodworksBlocks.ACACIA_CHEST.get(), WoodworksBlocks.DARK_OAK_CHEST.get(), WoodworksBlocks.MANGROVE_CHEST.get(), WoodworksBlocks.CRIMSON_CHEST.get(), WoodworksBlocks.WARPED_CHEST.get(), WoodworksBlocks.OAK_TRAPPED_CHEST.get(), WoodworksBlocks.SPRUCE_TRAPPED_CHEST.get(), WoodworksBlocks.BIRCH_TRAPPED_CHEST.get(), WoodworksBlocks.JUNGLE_TRAPPED_CHEST.get(), WoodworksBlocks.ACACIA_TRAPPED_CHEST.get(), WoodworksBlocks.DARK_OAK_TRAPPED_CHEST.get(), WoodworksBlocks.MANGROVE_TRAPPED_CHEST.get(), WoodworksBlocks.CRIMSON_TRAPPED_CHEST.get(), WoodworksBlocks.WARPED_TRAPPED_CHEST.get());
		this.tag(BlockTags.FLOWERS).add(WoodworksBlocks.FLOWERING_AZALEA_LEAF_PILE.get());

		this.tag(BlueprintBlockTags.LEAF_PILES).add(WoodworksBlocks.OAK_LEAF_PILE.get(), WoodworksBlocks.SPRUCE_LEAF_PILE.get(), WoodworksBlocks.BIRCH_LEAF_PILE.get(), WoodworksBlocks.JUNGLE_LEAF_PILE.get(), WoodworksBlocks.ACACIA_LEAF_PILE.get(), WoodworksBlocks.DARK_OAK_LEAF_PILE.get(), WoodworksBlocks.MANGROVE_LEAF_PILE.get(), WoodworksBlocks.AZALEA_LEAF_PILE.get(), WoodworksBlocks.FLOWERING_AZALEA_LEAF_PILE.get());

		this.tag(Tags.Blocks.CHESTS_WOODEN).add(WoodworksBlocks.OAK_CHEST.get(), WoodworksBlocks.SPRUCE_CHEST.get(), WoodworksBlocks.BIRCH_CHEST.get(), WoodworksBlocks.JUNGLE_CHEST.get(), WoodworksBlocks.ACACIA_CHEST.get(), WoodworksBlocks.DARK_OAK_CHEST.get(), WoodworksBlocks.MANGROVE_CHEST.get(), WoodworksBlocks.CRIMSON_CHEST.get(), WoodworksBlocks.WARPED_CHEST.get(), WoodworksBlocks.OAK_TRAPPED_CHEST.get(), WoodworksBlocks.SPRUCE_TRAPPED_CHEST.get(), WoodworksBlocks.BIRCH_TRAPPED_CHEST.get(), WoodworksBlocks.JUNGLE_TRAPPED_CHEST.get(), WoodworksBlocks.ACACIA_TRAPPED_CHEST.get(), WoodworksBlocks.DARK_OAK_TRAPPED_CHEST.get(), WoodworksBlocks.MANGROVE_TRAPPED_CHEST.get(), WoodworksBlocks.CRIMSON_TRAPPED_CHEST.get(), WoodworksBlocks.WARPED_TRAPPED_CHEST.get());
		this.tag(Tags.Blocks.CHESTS_TRAPPED).add(WoodworksBlocks.OAK_TRAPPED_CHEST.get(), WoodworksBlocks.SPRUCE_TRAPPED_CHEST.get(), WoodworksBlocks.BIRCH_TRAPPED_CHEST.get(), WoodworksBlocks.JUNGLE_TRAPPED_CHEST.get(), WoodworksBlocks.ACACIA_TRAPPED_CHEST.get(), WoodworksBlocks.DARK_OAK_TRAPPED_CHEST.get(), WoodworksBlocks.MANGROVE_TRAPPED_CHEST.get(), WoodworksBlocks.CRIMSON_TRAPPED_CHEST.get(), WoodworksBlocks.WARPED_TRAPPED_CHEST.get());

		this.tag(BlueprintBlockTags.LADDERS).add(WoodworksBlocks.SPRUCE_LADDER.get(), WoodworksBlocks.BIRCH_LADDER.get(), WoodworksBlocks.JUNGLE_LADDER.get(), WoodworksBlocks.ACACIA_LADDER.get(), WoodworksBlocks.DARK_OAK_LADDER.get(), WoodworksBlocks.MANGROVE_LADDER.get(), WoodworksBlocks.CRIMSON_LADDER.get(), WoodworksBlocks.WARPED_LADDER.get());
	}
}