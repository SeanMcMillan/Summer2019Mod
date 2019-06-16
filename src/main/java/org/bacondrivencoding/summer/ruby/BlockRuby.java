package org.bacondrivencoding.summer.ruby;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.bacondrivencoding.summer.SummerMod;

public class BlockRuby extends Block {

    public static final String BLOCK_RUBY_NAME = "block_ruby";

    public static final ResourceLocation BLOCK_RUBY = new ResourceLocation(SummerMod.MODID, BLOCK_RUBY_NAME);

    public BlockRuby() {
        super(Material.ROCK);
        setTranslationKey(SummerMod.MODID + "." + BLOCK_RUBY_NAME);
        setRegistryName(BLOCK_RUBY);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
