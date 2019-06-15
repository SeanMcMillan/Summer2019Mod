package org.bacondrivencoding.summer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.bacondrivencoding.summer.proxy.CommonProxy;

@Mod(modid = SummerMod.MODID, name = SummerMod.NAME, version = SummerMod.VERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class SummerMod
{
    public static final String MODID = "summermod";
    public static final String NAME = "Summer 2019 Mod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "org.bacondrivencoding.summer.proxy.ClientProxy", serverSide = "org.bacondrivencoding.summer.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SummerMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
