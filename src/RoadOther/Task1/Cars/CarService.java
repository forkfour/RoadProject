package RoadOther.Task1.Cars;

import java.util.Scanner;

public class CarService {
    private final Car[]cars;
    public CarService(){
        cars = fillCarArray();
    }
    public static Car[]fillCarArray(){
        Car c1 = new Car("Lada", "Red", CarEnumTechnical.SEDAN);
        Car c2 = new Car("Cherry", "Green", CarEnumTechnical.CROSSOVER);
        Car c3 = new Car("Dodge", "Blue", CarEnumTechnical.COUPE);
        Car c4 = new Car("Lamborgini", "Yellow", CarEnumTechnical.COUPE);
        Car c5 = new Car("Geely", "Gray", CarEnumTechnical.SEDAN);
        return new Car[]{c1, c2, c3, c4, c5};
    }
    public Car searhCar() throws CarNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input color to find: ");
        String color = scanner.nextLine();
        System.out.print("Input model to find: ");
        String model = scanner.nextLine();
        scanner.close();
        Car car = new Car(model, color, null);
            for (Car c : cars) {
                if (c.equals(car)) {
                    return c;
                }
            }
            throw new CarNotFoundException("This model car does not exist!");

    }
}
