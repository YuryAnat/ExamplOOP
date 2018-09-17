package main.quest_1.main;

import main.quest_1.enumType.Color;
import main.quest_1.carClass.FreightCar;
import main.quest_1.carClass.PassengerCar;
import main.quest_1.enumType.*;

public class RunExampl {
    public static void main(String[] args) {

        FreightCar car1 = new FreightCar("Toyota", "Freight1", Color.RED, Transmission.AUTOMATIC,
                                            Engine.DIESEL, 19.2f, 18);
        FreightCar car2 = new FreightCar("Man", "Freight2", Color.BLUE, Transmission.MECHANIC,
                Engine.PETROL, 20.2f, 18);

        PassengerCar car3 = new PassengerCar("Toyota", "Pass1", Color.YELLOW, Transmission.AUTOMATIC,
                Engine.HYBRID, 12.2f, 5, Body.SEDAN, 4, Wheel.LEFT );

        FreightCar car4 = new FreightCar("Toy", "Freight3", Color.YELLOW, Transmission.MECHANIC,
                Engine.PETROL, 30.6f, 22);

        PassengerCar car5 = new PassengerCar("Jeep", "Pass2", Color.YELLOW, Transmission.MECHANIC,
                Engine.HYBRID, 14.2f, 2, Body.OFF_ROAD, 2, Wheel.RIGHT );

        Stock stock = new Stock();
        stock.addCar(car1);
        stock.addCar(car2);
        stock.addCar(car3);
        stock.addCar(car4);
        stock.addCar(car5);

        stock.allCarToList(stock.getList());
        System.out.println("Average speed: " + stock.averageSpeed(stock.getList()));
        stock.CarByColor(stock.getList());
    }
}
