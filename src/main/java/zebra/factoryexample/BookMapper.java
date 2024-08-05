package zebra.factoryexample;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper( uses = BookRepository.class)
public interface BookMapper {

//    @Mapping(target = "list", source = "list")
//    @Mapping(source = "hiddenMessage", target = "secret", qualifiedByName = "secret")
//    Book bookToBookDTO(BookDTO book);

    Book dtoToBook(BookDTO dto, @MappingTarget Book book);



}
