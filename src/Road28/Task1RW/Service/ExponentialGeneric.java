package Road28.Task1RW.Service;

public class ExponentialGeneric<T extends Number> {
    private final T input;

    ExponentialGeneric(T input) {
        this.input = input;
    }

    public double Exponency(double exp) {
        return Math.pow(input.doubleValue(), exp);
    }
}
