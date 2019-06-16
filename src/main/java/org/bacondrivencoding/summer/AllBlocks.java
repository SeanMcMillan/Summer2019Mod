package org.bacondrivencoding.summer;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.bacondrivencoding.summer.ruby.BlockRuby;

public class AllBlocks {
    @GameRegistry.ObjectHolder(SummerMod.MODID + ":" + BlockRuby.BLOCK_RUBY_NAME)
    public static BlockRuby blockRuby;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockRuby.initModel();
    }
}
