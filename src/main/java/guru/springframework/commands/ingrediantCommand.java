package guru.springframework.commands;

import guru.springframework.domain.Recipe;
import guru.springframework.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Component
public class ingrediantCommand {

    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure umo ;
    private Recipe recipe;
}
