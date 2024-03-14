
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftultimate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftultimate.block.BloctuluviariteBlock;
import net.mcreator.minecraftultimate.MinecraftUltimateForgeMod;

public class MinecraftUltimateForgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftUltimateForgeMod.MODID);
	public static final RegistryObject<Block> BLOCTULUVIARITE = REGISTRY.register("bloctuluviarite", () -> new BloctuluviariteBlock());
}
