package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) {
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.changeObservers = changeObservers;
        models.add(new PoligonalModel(null));
        scenes.add(new Scene(1, null, null, null));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    public Scene getScene(Integer idScene){
        return null;
    }

    // Регистрация изменений
    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
