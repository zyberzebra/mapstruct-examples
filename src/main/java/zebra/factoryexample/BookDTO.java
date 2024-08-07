package zebra.factoryexample;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private String hiddenMessage;
    private List<BookDTO> list;

}
