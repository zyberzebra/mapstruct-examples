package zebra.abstractbase;

import lombok.Data;

@Data
public class BookDTO implements ProductDTO {
    private double price;
    private String title;
    private long inventoryID;
}
