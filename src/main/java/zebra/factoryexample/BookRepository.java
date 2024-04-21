package zebra.factoryexample;

import org.mapstruct.Named;
import org.mapstruct.ObjectFactory;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {

    private final Map<Long,Book> bookRepo = new HashMap<>();

    public Book getBookFromShelf(Long id){
     return bookRepo.getOrDefault(id,new Book(-404L));
    }
    @ObjectFactory
    public Book getBookFromShelf(BookDTO dto){
        return getBookFromShelf(dto.getId());
    }

    @Named("secret")
    public int secretStuff(String secret){
        return 1337;
    }
}
