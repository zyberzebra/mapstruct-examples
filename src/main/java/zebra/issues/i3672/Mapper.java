package zebra.issues.i3672;

@org.mapstruct.Mapper(
        uses = EmptyObjectMapper.class
)
public interface Mapper {
    AInternal convert(A a);
    A convert(AInternal aInternal);
}

@org.mapstruct.Mapper
interface EmptyObjectMapper {

    ABCInternal convert (ABC aInternal);
    ABC convert (ABCInternal aInternal);
}

@org.mapstruct.Mapper
interface EmptyObjectMapperNull {

    default ABCInternal convert (ABC aInternal){
        return null;
    }
    default ABC convert (ABCInternal aInternal){
        return null;
    }
}
