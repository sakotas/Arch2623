package Classes;

import Enumerators.TypeFuel;
import Enumerators.TypeCar;
import Enumerators.TypeGearbox;

import java.awt.*;

public abstract class Car {
    private String make;
    private String model;
    private TypeCar bodyType;
    private Integer numberWheels;
    private TypeFuel typeFuel;
    private TypeGearbox typeGearbox;
    private Color color;
    private float engineVolume;

    public Car(String make,
               String model,
               TypeCar bodyType,
               Integer numberWheels,
               TypeFuel typeFuel,
               TypeGearbox typeGearbox,
               Color color,
               float engineVolume) {
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.typeFuel = typeFuel;
        this.typeGearbox = typeGearbox;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public void movement(){}
    public void maintenance(){}
    public boolean turnLights(){return true;}
    public boolean turnWrappers(){return true;}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public TypeGearbox getTypeGearbox() {
        return typeGearbox;
    }

    public void setTypeGearbox(TypeGearbox typeGearbox) {
        this.typeGearbox = typeGearbox;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
}
