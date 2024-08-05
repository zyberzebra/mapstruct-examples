package zebra.issues._3552;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


public class RoomMapperTest {

    @Test
    void asdf(){
        Room model = new Room(null);
        RoomBuilder roomBuilder = new RoomBuilder();
        Room room = RoomMapper.INSTANCE.updateModelFull( model);

        assertThat(room.getPhotos()).isNull();
    }

}
