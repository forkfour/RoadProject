package Road.IOStream31;

import Road.IOStream31.Service.Car;
import static Road.IOStream31.Service.CarService.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.CacheRequest;
import java.util.List;

public class MainCarIO {
    public static void main(String[] args) {
        // read cars from file
        carsArrayList = getCarArray(); // create base list of 3 cars
        System.out.println(getCarArrayInfo(carsArrayList));
        writeCarArrayToFile(getCarArrayInfo(carsArrayList), "./IOFiles/cars2.txt");

        // create new car list and add cars to file
        List<Car> carsNew;
        String carsString = readFromCarArrayFile("./IOFiles/cars3.txt");
        carsNew = splitStringToArray(carsString);
        System.out.println("---");
        System.out.println(getCarArrayInfo(carsNew));

        // add another cars to base list and write list to file
        carsArrayList.add(new Car<Integer>("Gaz-24", "Pretty Rusty", 100500));
        carsArrayList.add(new Car<String>("Moskvich-3", "Unfair White", "342 NNM"));
        writeCarArrayToFile(getCarArrayInfo(carsArrayList), "./IOFiles/cars3.txt");
        System.out.println("=============");
        System.out.println(getCarArrayInfo(carsArrayList));
    }

}
