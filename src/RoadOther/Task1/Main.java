package RoadOther.Task1;

import RoadOther.Task1.Cars.CarNotFoundException;
import RoadOther.Task1.Cars.CarService;

public class Main {
    public static void main(String[] args) {
        CarService service = new CarService();
        try {
            System.out.println(service.searhCar());
        } catch (CarNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
