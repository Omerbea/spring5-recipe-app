package guru.springframework.converters;

import guru.springframework.commands.ingrediantCommand;
import guru.springframework.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ingrediantCommandToIngrediant implements Converter<ingrediantCommand, Ingredient> {


    private final unitOfMesureCommandToUnitOfMesure umoConverter;

    public ingrediantCommandToIngrediant(unitOfMesureCommandToUnitOfMesure uomConverter) {
        this.umoConverter = uomConverter;
    }

    @Override
    @Synchronized
    @Nullable
    public Ingredient convert(ingrediantCommand source) {
        if(source == null ) {
            return null;
        }

        final Ingredient ingredient = new Ingredient();
        ingredient.setId(source.getId());
        ingredient.setAmount(source.getAmount());
        ingredient.setDescription(source.getDescription());
        ingredient.setRecipe(source.getRecipe());

        return ingredient;

    }
}
