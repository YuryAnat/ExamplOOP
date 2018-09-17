package main.quest_1.carClass;

import main.quest_1.enumType.Color;
import main.quest_1.enumType.Engine;
import main.quest_1.enumType.Transmission;

public class FreightCar extends Car{
    int transportationOfTons;

    public FreightCar(String brand, String model, Color color, Transmission transmission,
                      Engine engine, float timeTo100, int transportationOfTons) {
        super(brand, model, color, transmission, engine, timeTo100);
        this.transportationOfTons = transportationOfTons;
    }

    public int getTransportationOfTons() {
        return transportationOfTons;
    }

    public void setTransportationOfTons(int transportationOfTons) {
        this.transportationOfTons = transportationOfTons;
    }

}
