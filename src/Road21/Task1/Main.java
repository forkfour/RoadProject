package Road21.Task1;

import Road21.Task1.Cars.Car;
import Road21.Task1.Cars.CarEnumTechnical;
import Road21.Task1.Cars.CarNotFoundException;
import Road21.Task1.Cars.CarService;

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
