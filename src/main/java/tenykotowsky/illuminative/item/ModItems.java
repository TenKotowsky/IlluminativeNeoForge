package tenykotowsky.illuminative.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import tenykotowsky.illuminative.Illuminative;
import tenykotowsky.illuminative.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Illuminative.MOD_ID);

    public static final DeferredItem<Item> GLOW_FISH = ITEMS.registerSimpleItem("glow_fish", new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.1F).build()));

    public static final DeferredItem<Item> COOKED_GLOW_FISH = ITEMS.registerSimpleItem("cooked_glow_fish", new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.8F).build()));

    public static final DeferredItem<BlockItem> GLOW_INK_SAC_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("glow_ink_sac_block", ModBlocks.GLOW_INK_SAC_BLOCK);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
