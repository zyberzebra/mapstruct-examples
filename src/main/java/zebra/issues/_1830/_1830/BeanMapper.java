package zebra.issues._1830._1830;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(
)
public interface BeanMapper {

    BeanMapper INSTANCE = Mappers.getMapper( BeanMapper.class );


}
