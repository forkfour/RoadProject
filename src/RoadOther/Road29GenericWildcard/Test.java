package RoadOther.Road29GenericWildcard;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String s = Generic.getValue(list).toString();
        System.out.println(s);
    }
}
class Generic{
    public static <T> T getValue(ArrayList<T> list){
        return list.get(1);
    }
}
