package guru.springframework.converters;

import guru.springframework.commands.unitOfMesureCommand;
import guru.springframework.domain.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class unitOfMesureCommandToUnitOfMesure implements Converter<unitOfMesureCommand, UnitOfMeasure> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasure convert(unitOfMesureCommand source) {
        if(source == null) {
            return null;
        }

        final UnitOfMeasure umo = new UnitOfMeasure();
        umo.setId(source.getId());
        umo.setDescription(source.getDescription());
        return umo;
    }
}
