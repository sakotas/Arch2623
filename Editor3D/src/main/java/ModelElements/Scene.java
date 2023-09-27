package ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Type method1(Type value){
        return null;
    }

    public Type method2(Type value1, Type value2){
        return null;
    }

}
