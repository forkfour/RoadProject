package Road28.Task1RW.Service;

public class Main28T1RW {
    public static void main(String[] args) {
        ExponentialGeneric<Byte> byteExp = new ExponentialGeneric<>((byte) 10);
        ExponentialGeneric<Short> shortExp = new ExponentialGeneric<>((short) 2);
        ExponentialGeneric<Integer> integerExp = new ExponentialGeneric<>(3);
        ExponentialGeneric<Long> longExp = new ExponentialGeneric<>(4L);
        ExponentialGeneric<Double> doubleExp = new ExponentialGeneric<>(5d);
        ExponentialGeneric<Float> floatExp = new ExponentialGeneric<>(6f);

        System.out.println(byteExp.Exponency(2));
        System.out.println(shortExp.Exponency(3));
        System.out.println(integerExp.Exponency(2));
        System.out.println(longExp.Exponency(3));
        System.out.println(doubleExp.Exponency(2));
        System.out.println(floatExp.Exponency(3));
    }
}
