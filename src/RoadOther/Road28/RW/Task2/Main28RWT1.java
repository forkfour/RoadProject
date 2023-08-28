package RoadOther.Road28.RW.Task2;

public class Main28RWT1 {
    public static void main(String[] args) {
        ExponentUpscaler<Byte> byteExp = new ExponentUpscaler<>((byte) 10);
        ExponentUpscaler<Short> shortExp = new ExponentUpscaler<>((short) 2);
        ExponentUpscaler<Integer> integerExp = new ExponentUpscaler<>(5);
        ExponentUpscaler<Long> longExp = new ExponentUpscaler<>(3L);
        ExponentUpscaler<Double> doubleExp = new ExponentUpscaler<>(4.5d);
        ExponentUpscaler<Float> floatExp = new ExponentUpscaler<>(6.1f);

        System.out.println(byteExp.pow(2));
        System.out.println(shortExp.pow(3));
        System.out.println(integerExp.pow(2));
        System.out.println(longExp.pow(3));
        System.out.println(doubleExp.pow(2));
        System.out.println(floatExp.pow(3));
    }
}
