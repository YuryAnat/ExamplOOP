package main.quest_1.main;

import main.quest_1.carClass.brand.Bmw;
import main.quest_1.carClass.brand.Toyota;
import main.quest_1.carClass.brand.Vaz;
import main.quest_1.enumType.*;

public class RunExampl {
    public static void main(String[] args) {

        Vaz car1 = new Vaz("", "2101", Color.GREEN, Transmission.MECHANIC,
                                            Engine.PETROL, 19.00f, Body.SEDAN);

        Toyota car2 = new Toyota("", "Sun", Color.BLUE, Transmission.AUTOMATIC,
                Engine.HYBRID, 20.20f, Body.MINIVAN);

        Bmw car3 = new Bmw("", "Passat", Color.RED, Transmission.AUTOMATIC,
                Engine.DIESEL, 16.02f, Body.SEDAN);

        Bmw car4 = new Bmw("", "X5", Color.RED, Transmission.AUTOMATIC,
                Engine.PETROL, 14.60f, Body.OFF_ROAD);

        Vaz car5 = new Vaz("Jeep", "Pass2", Color.YELLOW, Transmission.MECHANIC,
                Engine.HYBRID, 18.02f, Body.SEDAN );

        Stock stock = new Stock();
        stock.addCar(car1);
        stock.addCar(car2);
        stock.addCar(car3);
        stock.addCar(car4);
        stock.addCar(car5);

        stock.allCarToList(stock.getList());
        System.out.println("Average speed: " + stock.averageSpeed(stock.getList()) +"\n");
        stock.CarByColor(stock.getList());
    }
}
