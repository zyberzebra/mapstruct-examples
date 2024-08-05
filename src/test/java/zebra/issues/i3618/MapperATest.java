package zebra.issues.i3618;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.*;

class MapperATest {

    @Spy
    MapperB mapperB = Mappers.getMapper( MapperB.class );

    @InjectMocks
    MapperA mapperA;

    void iAmATest(){

        List<Model1> model1s = mapperA.onlyMapFirstItemInList( List.of( new Model2() ) );

        MapperB mapperB = mapperA.getMapperB();

        Model1 model1 = mapperB.model2ToModel1Mapper( new Model2() );

    }

}