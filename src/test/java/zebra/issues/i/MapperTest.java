package zebra.issues.i;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class MapperTest {

    @Test
    void mapTest(){
        Mapper mapper = Mappers.getMapper( Mapper.class );
        Cheeseplane cheeseplane = mapper.map(
            Airplane.builder().airplaneID( 5 ).build(),
            Cheese.builder().country( "Austria" ).build()
        );

        assertThat(cheeseplane)
            .isNotNull()
            .extracting( Cheeseplane::getFunnyCombinationOfIdAndCountry )
            .isEqualTo( "5Austria" );

    }

}