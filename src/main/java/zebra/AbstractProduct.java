package zebra;

import lombok.Data;

@Data
public abstract class AbstractProduct implements TechnicalStuff{
    private double price;
    private long inventoryID;
}
