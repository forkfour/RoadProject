package RoadOther.Road25.Service.Figures;

import RoadOther.Road25.Service.Shapes;
import RoadOther.Road25.Service.WrongFigureExcepton;

import java.util.Scanner;

public class ShapeService {
    public static String getFigure() throws WrongFigureExcepton {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input shape: ");
        String inputShape = scanner.nextLine();
        System.out.print("Input side length: ");
        int inputLength = scanner.nextInt();
        if (inputShape.equals("Square")) return Shapes.SQUARE.getShape();
        if (inputShape.equals("Triangle")) return Shapes.TRIANGLE.getShape();
        throw new WrongFigureExcepton("Bad figure shape! Over.");
    }
    public static void printShape(String input){
        Figure figure = new Figure();
        switch (input){
            case "Square":
                figure = new Figure() {
                    @Override
                    void printFigure() {
                        System.out.println("Square under construction! Be patient!");
                    }
                };
                break;
            case "Triangle":
                figure = new Figure() {
                    @Override
                    void printFigure() {
                        System.out.println("Triangle under construction! Be patient!");
                    }
                };
                break;
            }
        figure.printFigure();
    }
}
