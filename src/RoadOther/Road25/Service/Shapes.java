package RoadOther.Road25.Service;

public enum Shapes {
    TRIANGLE("Triangle", 1),
    SQUARE("Square", 2);
    private String shape;
    private int number;

    Shapes(String shape, int number){
        this.shape = shape;
        this.number = number;
    }
    public String getShape(){
        return shape;
    }
}
