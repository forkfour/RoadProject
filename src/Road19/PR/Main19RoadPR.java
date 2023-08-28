package Road19.PR;

import Road19.PR.Car.Car;
import Road19.PR.CarService.CarService;

import java.util.Scanner;

public class Main19RoadPR {
    public static void main(String[] args) {
        CarService carService = new CarService(obtainCars());
        System.out.println(" ===== ALL CARS =====");
//        for(Car c : carService.cars) {
//            System.out.println(c);
//        }
        Car carOnDemand = createCar();
        System.out.println(" ===== RESULT ===== ");
        System.out.println(carService.findCar(carOnDemand));

    }
    private static Car createCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input parameters for search below:");
        System.out.print("Input number: ");
        String number = scanner.nextLine();
        System.out.print("Input model: ");
        String model = scanner.nextLine();
//        System.out.print("Input year: ");
//        int year = scanner.nextInt();
//        System.out.print("Enter is Servise Annual?: ");
//        boolean serviceAnnual = scanner.nextBoolean();
        scanner.close();
        return new Car(number, model, 0, false);

    }


    private static Car[] obtainCars(){
        Car car1 = new Car("M 915 AEF", "Vesta", 2021, true );
        Car car2 = new Car("M 708 KGB", "F7", 2021, true );
        Car car3 = new Car("M 873 AAD", "Taos", 2021, true );
        Car car4 = new Car("A 001 AA", "Accent", 2021, true );
        Car car5 = new Car("M 384 JAC", "Rio X", 2021, true );
        Car car6 = new Car("M 274 LAJ", "Patriot", 2021, true );
        Car car7 = new Car("M 888 BBB", "Viper", 2021, true );
        Car car8 = new Car("M 762 LBG", "Rav4", 2021, true );
        Car car9 = new Car("A 001 OOO", "Gallardo", 2021, true );
        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9};
    }
}
