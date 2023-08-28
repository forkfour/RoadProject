package Road.IOStream31.Service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CarService {
    public static List<Car> carsArrayList;
    public static void writeCarArrayToFile(String carsString, String filePath){
        try (FileOutputStream fos = new FileOutputStream(filePath)){
            byte[] buffer = carsString.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("File write success!");
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static String readFromCarArrayFile(String filePath){
        String result = "";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] buffer = new byte[256];
            int count;
            while((count = fis.read(buffer)) != -1) {
                for (int i = 0; i < count; i++) {
                    result += (char)buffer[i];
                }
            }
            System.out.println("File read success!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    public static List<Car> getCarArray(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car<String>("Dodge Viper", "Red with stripes", "915 AEF"));
        carList.add(new Car<Integer>("Tesla Model X", "Gray", 12345));
        carList.add(new Car<String>("UAZ Patriot", "Shitty Brown", "654 GVN"));
        return carList;
    }
    public static <T>String getCarArrayInfo(List<Car> cars){
        String result = "";
        for (Car<T> c : cars) {
            result += c.getInfo() + "\n";
        }
        return result;
    }

    public static List<Car> splitStringToArray(String str){
        String[] carsInfo;
        String[] carsAccuracy;
        List<Car> cars = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\n");
        carsInfo = pattern.split(str);
        pattern = Pattern.compile(",");
        for(String s : carsInfo){
            carsAccuracy = pattern.split(s);
            for (String sq : carsAccuracy){
                System.out.println(sq);
            }
                cars.add(new Car<>(carsAccuracy[0], carsAccuracy[1], carsAccuracy[2]));
        }
        return cars;
    }
}
