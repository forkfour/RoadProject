package Road14Override;

import Road14Override.Models.SmoothFigure;
import Road14Override.Models.Square;
import Road14Override.Models.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(3);
        square.printFigure();
        Triangle triangle = new Triangle(4);
        triangle.printFigure();
    }
}
