package zebra.factoryexample;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper( uses = BookRepository.class)
public interface BookMapper {

    @Mapping(source = "hiddenMessage", target = "secret", qualifiedByName = "secret")
    Book bookToBookDTO(BookDTO book);



}
