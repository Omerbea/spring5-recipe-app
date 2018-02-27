package guru.springframework.converters;

import guru.springframework.commands.categoryCommand;
import guru.springframework.domain.Category;
import org.springframework.core.convert.converter.Converter;

public class categoryCommandToCategory implements Converter<categoryCommand, Category> {
    @Override
    public Category convert(categoryCommand source ) {
        if (source == null) {
            return null;
        }

        Category returnedCategory = new Category();

        returnedCategory.setId(source.getId());
        returnedCategory.setDescription(source.getDescription());
        returnedCategory.setRecipes(source.getRecipes());

        return returnedCategory;
    }
}
