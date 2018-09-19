package main.quest_1.carClass.brand;

import main.quest_1.carClass.WheelLeft;
import main.quest_1.enumType.*;

public class Bmw extends WheelLeft {
    private final String brand = "BMW";

    public Bmw(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100, Body body) {
        super(brand, model, color, transmission, engine, timeTo100, body);
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
