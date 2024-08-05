package zebra.issues.i3653;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemMapperTest {

    @Test
    void test() {
        ItemMapperImpl itemMapper = new ItemMapperImpl();
        Source source = new Source();

        Target target = itemMapper.mapItems(source);

        assertThat(target.items).isNotNull();
    }
}