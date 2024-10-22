package casti.benja.items;

import casti.benja.PruebaMC;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET  = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET  = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(FoodComponents.COOKED_BEEF)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PruebaMC.MOD_ID,name), item);
    }


    public static void registerModItems() {
        PruebaMC.LOGGER.info("Registrando Items del mod: " + PruebaMC.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BANANA);
        });


        FuelRegistry.INSTANCE.add(PINK_GARNET, 20*20);

    }



}
