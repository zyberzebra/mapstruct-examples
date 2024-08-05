package zebra.issues.i;

import org.mapstruct.Context;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@org.mapstruct.Mapper
public interface Mapper {

    @Mapping( target = "funnyCombinationOfIdAndCountry", source = "airplane", qualifiedByName = "combine" )
    Cheeseplane map(Airplane airplane, @Context Cheese cheese);

    @Named( "combine" )
    default String combineAirplane(Airplane airplane, @Context Cheese cheese){
        return airplane.getAirplaneID() + cheese.getCountry();
    }
}
