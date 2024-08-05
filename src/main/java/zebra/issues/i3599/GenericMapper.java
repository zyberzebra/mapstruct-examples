package zebra.issues.i3599;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(

)
public interface GenericMapper {

    BeanDto map(BeanEntity bean);

    BeanEntity map(BeanDto beanDto);

    default String defaultString(String anything){
        return "default";
    }

    default String defaultString(Object asdf){
        return "default";
    }
}
