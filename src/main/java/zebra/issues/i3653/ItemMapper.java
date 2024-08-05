package zebra.issues.i3653;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Data
class Source {
    List<String> items;
}
@lombok.Builder
@NoArgsConstructor
@AllArgsConstructor
class Target {
    @lombok.Builder.Default
    List<String> items = new ArrayList<>();
}
@Mapper(
        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        typeConversionPolicy = ReportingPolicy.ERROR,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public abstract class ItemMapper {
    @Mapping(target = "items", defaultExpression = "java(List.of())")
    public abstract Target mapItems(Source source);
}

