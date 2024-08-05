package zebra.factoryexample;

import org.mapstruct.Named;

public interface Repository {
    @Named("secret")
    int secretStuff(String secret);
}
