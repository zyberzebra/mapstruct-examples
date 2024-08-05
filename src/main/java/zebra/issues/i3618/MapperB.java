package zebra.issues.i3618;

import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper
public interface MapperB {
    Model1 model2ToModel1Mapper(Model2 model2);
}
