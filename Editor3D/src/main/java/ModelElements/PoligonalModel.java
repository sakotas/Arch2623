package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<Poligon>();
        this.textures = textures;
    }
}
