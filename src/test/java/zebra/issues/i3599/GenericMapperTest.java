package zebra.issues.i3599;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GenericMapperTest {

    @Test
    void mapTest(){
        GenericMapper mapper = Mappers.getMapper( GenericMapper.class );
        BeanEntity bean = new BeanEntity();
        bean.setA( "a" );
        bean.setB( "b" );

        BeanDto beanDto = mapper.map( bean );

        assertThat(beanDto.getA()).isEqualTo( "default" );
        assertThat(beanDto.getB()).isEqualTo( "default" );
//        assertThat(beanDto.getFun()).isEqualTo( "default" );
    }

}