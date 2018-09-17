package quest_1.interfaceCar;

import quest_1.CarClass.Car;

import java.util.List;

public interface AverageSpeed {
    public float averageSpeed(List<? extends Car> allCar);
}
