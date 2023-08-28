package Road28.RW.Task2;

public class Main28RWT2 {
    public static void main(String[] args) {
        Cover<String>obj1 = new Cover<>(null);
        Cover<Object>obj2 = new Cover<>(new Object());
        System.out.println(obj1.isNull());
        System.out.println(obj2.isNull());

    }
}
class Cover<T>{
    private final T object;

    public Cover(T object){
        this.object = object;
    }

    public boolean isNull(){
        return object == null;
    }

    public T getObject(){
        return object;
    }
}