package Road25.Service.Figures;

import Road25.Service.Shapes;

public class Square extends Figure{
    private String type;
    private int length;
    private Shapes shape;
    public Square(String type, int length){
        this.type = type;
        this.length = length;
        this.shape = Shapes.SQUARE;
    }

    @Override
    public void printFigure() {
        System.out.println();
    }


    public String getShape() {
        return shape.name();
    }
}
