package zebra;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Book extends AbstractProduct {

    private String title;
}


