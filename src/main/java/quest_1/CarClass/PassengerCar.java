package quest_1.CarClass;

import quest_1.enumType.*;

public class PassengerCar extends Car{
    private int numberOfPassengers;
    private Body body;
    private int numberOfDoors;
    private Wheel steeringWheel;

    public PassengerCar(String brand, String model, Color color, Transmission transmission, Engine engine,
                        float timeTo100, int numberOfPassengers, Body body, int numberOfDoors, Wheel steeringWheel) {
        super(brand, model, color, transmission, engine, timeTo100);
        this.numberOfPassengers = numberOfPassengers;
        this.body = body;
        this.numberOfDoors = numberOfDoors;
        this.steeringWheel = steeringWheel;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Wheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(Wheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }


    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
