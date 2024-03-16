package zebra;

import org.junit.jupiter.api.Test;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookMapperTest {
    BookMapper bookMapper = Mappers.getMapper(BookMapper.class);
    @Test
    void mapBook() {
        Book book = new Book();
        book.setTitle("East of Eden");
        book.setPrice(5);
        BookDTO bookDTO = bookMapper.bookToBookDTO(book);
        assertThat(bookDTO.getPrice()).isEqualTo(4.99);
    }

}