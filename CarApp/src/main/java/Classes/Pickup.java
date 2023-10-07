package Classes;

import Enumerators.TypeCar;
import Enumerators.TypeFuel;
import Enumerators.TypeGearbox;
import Interfaces.ICarWash;
import Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash {

    private Integer loadCapacity;

    public Pickup(String make, String model,
                  Integer numberWheels, TypeFuel typeFuel, TypeGearbox typeGearbox,
                  Color color, float engineVolume, Integer loadCapacity) {

        super(make, model, TypeCar.PICKUP, numberWheels, typeFuel, typeGearbox, color, engineVolume);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public void fuel() {

    }

    @Override
    public void wipeWindshield() {

    }

    @Override
    public void wipeHeadlights() {

    }

    @Override
    public void wipeMirrors() {

    }
}
