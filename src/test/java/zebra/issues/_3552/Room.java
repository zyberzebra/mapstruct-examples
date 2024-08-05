package zebra.issues._3552;

import java.util.List;

public class Room {

    private final List<String> photos;

    public Room(List<String> photos) {
        this.photos = photos;
    }

    public List<String> getPhotos() {
        return photos;
    }

}