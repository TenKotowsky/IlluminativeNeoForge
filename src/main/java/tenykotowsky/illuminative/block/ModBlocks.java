package tenykotowsky.illuminative.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import tenykotowsky.illuminative.Illuminative;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Illuminative.MOD_ID);

    public static final DeferredBlock<Block> GLOW_INK_SAC_BLOCK = BLOCKS.registerSimpleBlock("glow_ink_sac_block", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
            .mapColor(MapColor.COLOR_CYAN)
            .sound(SoundType.MUD)
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
