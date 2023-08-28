package RoadOther.Road29GenericWildcard.Task2;

public class Generic<T extends Number> {
    private final T number;

    Generic(T number){
        this.number = number;
    }

    public double getPow(T number, int pow){
        return Math.pow(number.doubleValue(), pow);
    }

    public T getNumber(){
        return number;
    }
}
