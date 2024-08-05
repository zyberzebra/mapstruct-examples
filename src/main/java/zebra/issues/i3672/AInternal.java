package zebra.issues.i3672;

import lombok.Data;

@Data
public class AInternal {

    String x;
    ABCInternal abc;
}

class ABCInternal {}