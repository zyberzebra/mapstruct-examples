package zebra.issues.i3618;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(
    componentModel = MappingConstants.ComponentModel.JAKARTA
)
public abstract class MapperA {

    @Getter
    @Setter(onMethod_ = @Inject)
    MapperB mapperB;

    List<Model1> onlyMapFirstItemInList(List<Model2> source) {
        return Optional.ofNullable( source )
            .filter( model2s -> !model2s.isEmpty() )
            .map( list -> list.get( 0 ) )
            .map( model2 -> getMapperB().model2ToModel1Mapper( model2 ) )
            .map( Collections::singletonList )
            .orElse( null );
    }
}