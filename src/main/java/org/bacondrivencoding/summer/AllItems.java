package org.bacondrivencoding.summer;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.bacondrivencoding.summer.ruby.ItemRuby;

public class AllItems {
    @GameRegistry.ObjectHolder(SummerMod.MODID + ":" + ItemRuby.ITEM_RUBY_NAME)
    public static ItemRuby itemRuby;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemRuby.initModel();
    }

}
