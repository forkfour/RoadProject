package Road25;

import Road25.Service.Figures.Figure;
import Road25.Service.Figures.ShapeService;
import Road25.Service.WrongFigureExcepton;

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
