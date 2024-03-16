package zebra;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;

@MapperConfig(
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG
)
public interface ProductMapperConfig {
    @Mapping(target = "price", ignore = true)
    ProductDTO anyEntityToDTO(AbstractProduct entity);
}
