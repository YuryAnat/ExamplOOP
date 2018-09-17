package quest_1.interfaceCar;

import quest_1.CarClass.Car;

import java.util.List;

public interface ListCar {
    public void allCarToList(List<? extends Car> allCar);
}
