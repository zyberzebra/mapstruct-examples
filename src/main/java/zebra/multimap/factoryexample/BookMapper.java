package zebra.multimap.factoryexample;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper( uses = BookRepository.class)
public interface BookMapper {

    @Mapping(source = "hiddenMessage", target = "secret", qualifiedByName = "secret")
    Book dtoTOBook(BookDTO book);



}
