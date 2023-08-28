package RoadOther.Road29GenericWildcard.Task2;

public class Main29T2 {
    public static void main(String[] args) {
        Generic<?> gen = new Generic<>(5);
        System.out.println(someMethod(gen.getNumber()));

    }
    static Generic<? extends Number> someMethod(Number object){
        return new Generic<>(object);
    }

}
