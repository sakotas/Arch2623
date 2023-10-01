package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    /*
    Если агрегация (не закрашенный ромб), то мы добавляем значения из вне (передаем в конструктор и тд)
    Если компонент (закрашенный ромб), то мы в конструкторе инициализируем новую сущность с этим типом данных
     */
    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<Poligon>();
        this.textures = textures;
    }
}
