package org.bacondrivencoding.summer.ruby;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.bacondrivencoding.summer.SummerMod;

public class ItemRuby extends Item {
    public static final String ITEM_RUBY_NAME = "item_ruby";
    public static final ResourceLocation ITEM_RUBY = new ResourceLocation(SummerMod.MODID, ITEM_RUBY_NAME);

    public ItemRuby() {
        setTranslationKey(SummerMod.MODID + "." + ITEM_RUBY_NAME);
        setRegistryName(ITEM_RUBY);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
