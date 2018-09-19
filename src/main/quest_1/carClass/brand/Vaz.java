package main.quest_1.carClass.brand;

import main.quest_1.carClass.WheelLeft;
import main.quest_1.enumType.Body;
import main.quest_1.enumType.Color;
import main.quest_1.enumType.Engine;
import main.quest_1.enumType.Transmission;

public class Vaz extends WheelLeft {
    private final String brand = "Vaz";

    public Vaz(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100, Body body) {
        super(brand, model, color, transmission, engine, timeTo100, body);
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
