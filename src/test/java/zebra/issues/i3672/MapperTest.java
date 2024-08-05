package zebra.issues.i3672;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {
    @Test
    void test(){
        A a = new A();
        AInternal aInternal = new AInternal();

        Mapper mapper = Mappers.getMapper(Mapper.class);

        AInternal convertedA = mapper.convert(a);
        A finalA = mapper.convert(convertedA);

        Assertions.assertEquals(a, finalA);
    }

}