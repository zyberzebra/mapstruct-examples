package zebra.abstractbase;

import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

@Mapper( config = ProductMapperConfig.class, uses = {ProductMapperConfig.class} )
public interface BookMapper {

  BookDTO bookToBookDTO(Book book);

  @ObjectFactory
  default BookDTO bookDTOToBookFactory(Book book){
    BookDTO bookDTO = new BookDTO();
    bookDTO.setPrice(calculatePriceSpecificForUser());
    return bookDTO;
  }

  default double calculatePriceSpecificForUser(){
    return 4.99; // imagine some crazy logic
  }


}