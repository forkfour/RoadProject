package RoadOther.Road25.Service.Figures;

import RoadOther.Road25.Service.Shapes;

public class Triangle extends Figure{
    private String type;
    private int length;
    private Shapes shape;
    public Triangle(String type, int length){
        this.type = type;
        this.length = length;
        this.shape = Shapes.TRIANGLE;
    }

    @Override
    public void printFigure() {

    }


    public String getShape() {
        return shape.name();
    }
}
