package RoadOther.Road28.Task3;

import java.util.List;

public class Main28_T3 {
    public static void main(String[] args) {
        String[] s = new String[]{"one", "two", "three", "two", "four", "five"};

    }

}
class Arr<T>{
    List<T> []array;

    Arr(T array){
        //this.array = (List<T>) array;
    }

    public String compare(List<T> input) throws RuntimeException{
        for (T arr : input){
            if (arr.toString().equals(input.toString())) return input.toString();
        }
        throw new RuntimeException("Not Found");
    }
}
