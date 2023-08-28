package Road19.PR.CarService;

import Road19.PR.Car.Car;

public class CarService {
    public Car [] cars;

    public CarService(Car[] cars){
        this.cars = cars;
    }

    public Car findCar(Car car){
        for (Car c : cars) {
            if (c.hashCode() == car.hashCode() && c.equals(car)){
                return c;
            }
        }
        return null;
    }


}
