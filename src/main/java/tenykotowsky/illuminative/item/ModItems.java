package tenykotowsky.illuminative.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import tenykotowsky.illuminative.Illuminative;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Illuminative.MOD_ID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.1F).build()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
