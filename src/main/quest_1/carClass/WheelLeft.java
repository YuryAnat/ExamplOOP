package main.quest_1.carClass;

import main.quest_1.enumType.*;

public class WheelLeft extends Car {
    private final Wheel wheelLeft = Wheel.LEFT;

    public WheelLeft(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100, Body body) {
        super(brand, model, color, transmission, engine, timeTo100, body);
    }

    public Wheel getWheelLeft() {
        return wheelLeft;
    }
}
