package Road21.Task1.Cars;

public class Car {
    private final String model;
    private String color;
    private final CarEnumTechnical tech;
    private int hashCode;

    public Car(String model, String color, CarEnumTechnical tech){
        this.model = model;
        this.color = color;
        this.tech = tech;
        hashCode = this.model.hashCode();
        hashCode += 31 * hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car)obj;
        return hashCode == car.hashCode && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public String toString() {
        return "=== Car Info ===\n" +
                "Car model - " + model +
                "\nCar color - " + color +
                "\nCar type - " + tech.getType() +
                "\nCar Doors Quantity - " + tech.getDoors() +
                "\nCar Seats Quantity - " + tech.getSeats();}
}
