package casti.benja.FoodComponents;
import casti.benja.items.ModItems;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent BANANA = (new FoodComponent.Builder())
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1500, 4), 0.5F)
            .nutrition(6)
            .saturationModifier(0.3F)
            .usingConvertsTo(ModItems.PEEL)
            .build();
}
