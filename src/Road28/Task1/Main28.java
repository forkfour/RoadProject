package Road28.Task1;

public class Main28 {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>(5);
        System.out.println(test);

    }

}
class Test<T extends Number>{
    private T value;
    Test(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{ - " + (Integer)value * (Integer)value + " - }";
    }
}
