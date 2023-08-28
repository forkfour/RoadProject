package Road29GenericWildcard.Task1;

public class Main29T1 {
    public static void main(String[] args) {
        GenericType1<Integer> gt1 = new GenericType1<>(2);
        GenericType1<Integer> gt2 = new GenericType1<>(null);
        System.out.println(someMethod(gt1, 2));
        System.out.println(someMethod(gt2, 3));

    }
    public static <T> T someMethod(GenericType1<T> type, T defaultType){
        return type.getType() == null ? defaultType : type.getType();
    }

}
class GenericType1<T>{
    private final T gt1;

    public GenericType1(T gt1){
        this.gt1 = gt1;
    }
    public T getType(){
        return gt1;
    }

}
