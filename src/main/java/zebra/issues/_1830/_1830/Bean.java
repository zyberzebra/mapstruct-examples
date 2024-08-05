package zebra.issues._1830._1830;

import java.util.List;

import lombok.Data;

@Data
public class Bean {
    private List<Bean> beans;

    public List<Bean> getBeans() {
        return beans;
    }

    public void setBeans(List<Bean> beans) {
        this.beans = beans;
    }
}
