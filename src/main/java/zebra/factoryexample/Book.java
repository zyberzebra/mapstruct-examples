package zebra.factoryexample;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Book implements TechnicalStuff{
    private final Long inventoryID;
    private String title;
    private int secret;
    private List<Book> list;
}
