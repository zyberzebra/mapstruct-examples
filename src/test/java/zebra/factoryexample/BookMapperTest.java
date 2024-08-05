package zebra.factoryexample;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;
class BookMapperTest {

    private final BookMapper mapper = Mappers.getMapper(BookMapper.class);

    @Test
    void objectFactoryShouldBeUsed() {
//        Book book = mapper.bookToBookDTO(new BookDTO());

//        assertThat(book.getInventoryID()).isEqualTo(-404L);
    }
    @Test
    void namedMapperIsUsed() {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setHiddenMessage("Hello World!");
//        Book book = mapper.bookToBookDTO(bookDTO);

//        assertThat(book.getSecret()).isEqualTo(1337);
    }

    @Test
    void asdf(){
        mapper.dtoToBook( new BookDTO(),new Book( 1L ) );
    }
}