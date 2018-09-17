package main.java.quest_1.main;

import quest_1.CarClass.Car;
import quest_1.CarClass.FreightCar;
import quest_1.CarClass.PassengerCar;
import quest_1.enumType.Color;
import quest_1.interfaceCar.AverageSpeed;
import quest_1.interfaceCar.CarByColor;
import quest_1.interfaceCar.ListCar;

import java.util.ArrayList;
import java.util.List;

public class Stock implements AverageSpeed, CarByColor, ListCar {
    private List<Car> allCar = new ArrayList<>();

    public void addCar(Car car) {
        allCar.add(car);
    }
    public List<? extends Car> getList(){
        return allCar;
    }



    @Override
    public float averageSpeed(List<? extends Car> allCar) {
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
    public void CarByColor(List<? extends Car> allCar) {
        int red = 0;
        int green = 0;
        int blue = 0;
        int yellow =0;
        if (allCar == null && !allCar.isEmpty()){
            System.out.println("No car..");
        }else {
            for (Car car : allCar) {
                if (car.getColor().equals(Color.BLUE)) blue++;
                if (car.getColor().equals(Color.GREEN)) green++;
                if (car.getColor().equals(Color.RED)) red++;
                if (car.getColor().equals(Color.YELLOW)) yellow++;
            }
            System.out.println("CarClass color: "+"\n\t Red: " + red
                                            +"\n\t Green: " + green
                                            +"\n\t Blue: " + blue
                                            +"\n\t Yellow: " + yellow);
        }
    }

    @Override
    public void allCarToList(List<? extends Car> allCar) {
        if (allCar == null && !allCar.isEmpty()){
            System.out.println("No car..");
        }else {
            for (Car car : allCar) {
                if (car instanceof FreightCar){
                    FreightCar fr = (FreightCar) car;
                    System.out.println("Freight Car: \n\t\tTransportationOfTons = " + fr.getTransportationOfTons());
                    System.out.println("Brand: " + car.getBrand()
                            + " model: " + car.getModel()
                            + " color: " + car.getColor());
                }
                if (car instanceof PassengerCar){
                    PassengerCar ps = (PassengerCar) car;
                    System.out.println("Passenger Car: \n\t\tSteeringWheel = " + ps.getSteeringWheel());
                    System.out.println("Brand: " + car.getBrand()
                            + " model: " + car.getModel()
                            + " color: " + car.getColor());
                }

            }
        }
    }
}
