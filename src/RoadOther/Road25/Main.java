package RoadOther.Road25;

import RoadOther.Road25.Service.Figures.ShapeService;
import RoadOther.Road25.Service.WrongFigureExcepton;

public class Main {
    public static void main(String[] args) {
        try {
            String figure = ShapeService.getFigure();
            ShapeService.printShape(figure);
        } catch (WrongFigureExcepton ex){
            System.out.println(ex.getMessage());
        }

    }
}
