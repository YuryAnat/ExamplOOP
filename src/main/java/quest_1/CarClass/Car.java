package quest_1.CarClass;

import quest_1.enumType.Color;
import quest_1.enumType.Engine;
import quest_1.enumType.Transmission;

public class Car {
    private String brand;
    private String model;
    private Color color;
    private Transmission transmission;
    private Engine engine;
    private float timeTo100;

    public Car(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.timeTo100 = timeTo100;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTimeTo100() {
        return timeTo100;
    }

    public void setTimeTo100(float timeTo100) {
        this.timeTo100 = timeTo100;
    }

}
