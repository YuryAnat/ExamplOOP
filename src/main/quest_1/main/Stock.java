package main.quest_1.main;

import main.quest_1.carClass.Car;
import main.quest_1.carClass.brand.Bmw;
import main.quest_1.carClass.brand.Toyota;
import main.quest_1.carClass.brand.Vaz;
import main.quest_1.enumType.Color;
import main.quest_1.interfaceCar.AverageSpeed;
import main.quest_1.interfaceCar.CarByColor;
import main.quest_1.interfaceCar.ListCar;

import java.util.*;

public class Stock implements AverageSpeed, CarByColor, ListCar {
    private List<Car> allCar = new ArrayList<>();
    private Map<Integer,Color> allColor = new HashMap<>();

    public void addCar(Car car) {
        allCar.add(car);
        allColor.put(car.hashCode(),car.getColor());
    }
    public List<Car> getList(){
        return allCar;
    }



    @Override
    public float averageSpeed(List<Car> allCar) {
        if (allCar == null && !allCar.isEmpty()){
            return 0;
        }else {
            float tmp = 0;
            for (Car car : allCar) {
                tmp += car.getTimeTo100();
            }
            tmp = tmp / allCar.size();
            return tmp;
        }
    }

    @Override
    public void CarByColor(List<Car> allCar) {
        for (Color value : Color.values()) {
            System.out.println("Car color: " + value.toString() + " "
                                + Collections.frequency(new ArrayList<Color>(allColor.values()), value));
        }
        System.out.println();
    }

    @Override
    public void allCarToList(List<Car> allCar) {
        if (allCar == null && !allCar.isEmpty()){
            System.out.println("No car..");
        }else {
            for (Car car : allCar) {
                if (car instanceof Bmw){
                    Bmw brand = (Bmw) car;
                    System.out.println("Wheel: " + ((Bmw) car).getWheelLeft());
                    System.out.println("Brand: " + brand.getBrand()
                            + " model: " + car.getModel()
                            + " color: " + car.getColor());
                }
                if (car instanceof Toyota){
                    Toyota brand = (Toyota) car;
                    System.out.println("Wheel: " + ((Toyota) car).getWheelRight());
                    System.out.println("Brand: " + brand.getBrand()
                            + " model: " + car.getModel()
                            + " color: " + car.getColor());
                }
                if (car instanceof Vaz){
                    Vaz brand = (Vaz) car;
                    System.out.println("Wheel: " + ((Vaz) car).getWheelLeft());
                    System.out.println("Brand: " + brand.getBrand()
                            + " model: " + car.getModel()
                            + " color: " + car.getColor());
                }
        }
            System.out.println();
        }
    }
}
