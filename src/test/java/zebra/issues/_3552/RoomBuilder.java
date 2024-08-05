package zebra.issues._3552;

import java.util.List;

public class RoomBuilder {

    protected List<String> photos;

    public RoomBuilder photos(List<String> photos) {
        this.photos = photos;
        return this;
    }

    public Room build() {
        return new Room( photos );
    }

}
