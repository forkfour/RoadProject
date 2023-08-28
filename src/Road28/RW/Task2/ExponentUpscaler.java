package Road28.RW.Task2;

public class ExponentUpscaler<T extends Number> {
    private final T number;

    ExponentUpscaler(T number) {
        this.number = number;
    }

    public double pow(double index){
        return Math.pow(number.doubleValue(), index);
    }
}
