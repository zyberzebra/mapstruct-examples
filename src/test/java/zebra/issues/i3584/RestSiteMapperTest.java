package zebra.issues.i3584;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RestSiteMapperTest {

    private final RestSiteMapper mapper = Mappers.getMapper(RestSiteMapper.class);
    private final static String TENANT_ID = "testTenant";

    @Test
    void testMapper() {
        RestSiteDto restSiteDto = new RestSiteDto();
        restSiteDto.setWillBeIgnore( 44L );

        SiteDto siteDto = mapper.convert(restSiteDto, TENANT_ID);

//        assertThat(siteDto.getTargetWillBeIgnore()).isEqualTo(44L);
    }

    @Test
    void testDefaultQualifiedField() {
        RestSiteDto restSiteDto = new RestSiteDto();
        // Set any necessary fields on restSiteDto

        String defaultResult = mapper.defaultQualifiedField(restSiteDto);

        assertEquals("defaultStuff", defaultResult, "DefaultQualifiedField does not match the expected value.");
    }
}