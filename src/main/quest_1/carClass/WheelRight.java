package main.quest_1.carClass;

import main.quest_1.enumType.*;

public class WheelRight extends Car {
    private final Wheel wheelRight = Wheel.RIGHT;

    public WheelRight(String brand, String model, Color color, Transmission transmission, Engine engine, float timeTo100, Body body) {
        super(brand, model, color, transmission, engine, timeTo100, body);
    }

    public Wheel getWheelRight() {
        return wheelRight;
    }
}

