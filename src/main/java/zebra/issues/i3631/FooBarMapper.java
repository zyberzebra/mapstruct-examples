package zebra.issues.i3631;

import lombok.Data;
import org.mapstruct.*;

@Mapper(config = FooBarConfig.class)
public interface FooBarMapper {

    Bar toBar(Foo foo);

    Foo toFoo(Bar bar);

}
@Data
class Foo { int secret; }
@Data
class Bar { int secret; }

@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
interface FooBarConfig {
    @Mapping(target = "secret", ignore = true)
    Bar toBar(Foo foo);
    @Mapping(target = "secret", ignore = true)
    Foo toFoo(Bar bar);
}

