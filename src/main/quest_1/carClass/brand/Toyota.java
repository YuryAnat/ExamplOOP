package main.quest_1.carClass.brand;

import main.quest_1.carClass.WheelRight;
import main.quest_1.enumType.*;

public class Toyota extends WheelRight {

    private final String brand = "Toyota";

    public Toyota(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100, Body body) {
        super(brand, model, color, transmission, engine, timeTo100, body);
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
