package RoadOther.PR.Car;

public class Car {
    private final String number;
    private final String model;
    private final int year;
    private boolean serviceAnnual;
    private int hashcode;

    public Car(String number, String model, int year, boolean serviceAnnual){
        this.number = number;
        this.model = model;
        this.year = year;
        this.serviceAnnual = serviceAnnual;
    }

    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public boolean getService(){
        return serviceAnnual;
    }
    public void setService(boolean set){
        this.serviceAnnual = set;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car)obj;
        return number.equals(car.number) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        if (hashcode == 0) {
            hashcode = number.hashCode();
            hashcode += 30 * hashcode;
        }
        return hashcode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", serviceAnnual=" + serviceAnnual +
                '}';
    }
}
