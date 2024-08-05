package zebra.issues.i3584;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(config = RestConfig.class)
public interface RestSiteMapper {
    @InheritConfiguration
    @Mapping(target = "qualifiedField", source = "source", qualifiedByName = "defaultQualifiedField")
    SiteDto convert(RestSiteDto source, String tenantId);

    @Named("defaultQualifiedField")
    default String defaultQualifiedField(RestSiteDto source){
        //do something
        return "defaultStuff";
    }
}