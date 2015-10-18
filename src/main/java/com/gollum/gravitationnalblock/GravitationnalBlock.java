package com.gollum.gravitationnalblock;

import com.gollum.core.ModGollumCoreLib;
import com.gollum.core.common.i18n.I18n;
import com.gollum.core.common.log.Logger;
import com.gollum.core.common.mod.GollumMod;
import com.gollum.core.common.version.VersionChecker;
import com.gollum.gravitationnalblock.common.CommonProxyGravitationnalBlock;
import com.gollum.gravitationnalblock.common.config.ConfigGravitationnalBlock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid                     = GravitationnalBlock.MODID,
	name                      = GravitationnalBlock.MODNAME, 
	version                   = GravitationnalBlock.VERSION, 
	acceptedMinecraftVersions = GravitationnalBlock.MINECRAFT_VERSION, 
	dependencies              = GravitationnalBlock.DEPENDENCIES
)
public class GravitationnalBlock extends GollumMod {

	public final static String MODID = "GravitationnalBlock";
	public final static String MODNAME = "Gravitationnal Block";
	public final static String VERSION = "1.0.0DEV";
	public final static String MINECRAFT_VERSION = "1.7.10";
	public final static String DEPENDENCIES = "required-after:"+ModGollumCoreLib.MODID;
	
	@Instance(GravitationnalBlock.MODID)
	public static GravitationnalBlock instance;
	
	@SidedProxy(clientSide = "com.gollum.gravitationnalblock.client.ClientProxyGravitationnalBlock", serverSide = "com.gollum.gravitationnalblock.common.CommonProxyGravitationnalBlock")
	public static CommonProxyGravitationnalBlock proxy;
	
	/**
	 * Gestion des logs
	 */
	public static Logger log;
	
	/**
	 * Gestion de l'i18n
	 */
	public static I18n i18n;
	
	/**
	 * La configuration
	 */
	public static ConfigGravitationnalBlock config;
	
	@EventHandler public void handler(FMLPreInitializationEvent event)  { super.handler (event); }
	@EventHandler public void handler(FMLInitializationEvent event)     { super.handler (event); }
	@EventHandler public void handler(FMLPostInitializationEvent event) { super.handler (event); }
	
	/** 1 **/
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		//Test la version du mod
		new VersionChecker();
	}
	
	/** 2 **/
	@Override
	public void init(FMLInitializationEvent event) {
	}
	
	/** 3 **/
	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}
	
}
