package main.quest_1.carClass;

import main.quest_1.enumType.Body;
import main.quest_1.enumType.Color;
import main.quest_1.enumType.Engine;
import main.quest_1.enumType.Transmission;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Color color;
    private Transmission transmission;
    private Engine engine;
    private float timeTo100;
    private Body body;

    public Car() {
    }

    public Car(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100, Body body) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.timeTo100 = timeTo100;
        this.body = body;

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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.timeTo100, timeTo100) == 0 &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                color == car.color &&
                transmission == car.transmission &&
                engine == car.engine &&
                body == car.body;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, transmission, engine, timeTo100, body);
    }
}
