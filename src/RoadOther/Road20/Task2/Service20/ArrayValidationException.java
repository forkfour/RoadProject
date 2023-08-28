package RoadOther.Road20.Task2.Service20;

public class ArrayValidationException extends Exception{
    public int arrayIndex;
    public int getArrayIndex() {
        return arrayIndex;
    }
    public ArrayValidationException(String message, int arrayIndex){
        super(message);
        this.arrayIndex = arrayIndex;
    }
}
