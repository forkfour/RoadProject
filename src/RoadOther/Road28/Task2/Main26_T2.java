package RoadOther.Road28.Task2;

public class Main26_T2 {
    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(123);
        Generic<Boolean> booleanGeneric = new Generic<>(true);
        Generic<String> StringGeneric = new Generic<>("Wooo");
        Generic<String> nullGeneric = new Generic<>(null);
        System.out.println(integerGeneric.getValue());
        System.out.println(booleanGeneric.getValue());
        System.out.println(StringGeneric.getValue());
    }
}
class Generic <T> {
    String value;
    Generic (T value){
        try {
            if (value == null) throw new RuntimeException("NULL!!!");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        this.value = value.toString();
    }
    public String getValue() {
        return value;
    }
}
