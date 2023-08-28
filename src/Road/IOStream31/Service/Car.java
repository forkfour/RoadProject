package Road.IOStream31.Service;

public class Car<T> {
    private final String name;
    private final String color;
    private final T number;

    public Car(String name, String color, T number) {
        this.name = name;
        this.color = color;
        this.number = number;
    }
    public String getInfo(){
        return name + "," + color + "," + number;
    }
}
