package com.deeplake.fakepeople.setup;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Registration {

//    public static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, Main.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCK_ENTITIES.register(bus);
        ModEntities.ENTITIES.register(bus);
//        ModSounds.SOUNDS.register(bus);
        ModEffects.EFFECTS.register(bus);
//        STRUCTURES.register(bus);
    }


//    public static final RegistryObject<StructureFeature<JigsawConfiguration>> THIEFDEN = STRUCTURES.register("thiefden", ThiefDenStructure::new);
//    public static final ResourceLocation RL_MYSTERIOUS_DIMENSION_SET = new ResourceLocation(Main.MOD_ID, "mysterious_dimension_structure_set");

//    public static final TagKey<Biome> HAS_PORTAL = TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Main.MOD_ID, "has_structure/portal"));
//    public static final TagKey<Biome> HAS_THIEFDEN = TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Main.MOD_ID, "has_structure/thiefden"));
//    public static final TagKey<StructureSet> MYSTERIOUS_DIMENSION_STRUCTURE_SET = TagKey.create(Registry.STRUCTURE_SET_REGISTRY, RL_MYSTERIOUS_DIMENSION_SET);

}
