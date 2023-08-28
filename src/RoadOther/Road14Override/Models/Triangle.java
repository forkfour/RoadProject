package RoadOther.Road14Override.Models;

public class Triangle {
    static final String FIGURE_NAME = "Triangle";
    protected int size;
    String [][] triangle;

    public Triangle (int size){
        this.size = size;
        triangle = new String[this.size][this.size * 2];
    }


    public void printFigure(){
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size * 2; j++) {
                this.triangle[i][j] = " ";
            }
        }
        if (this.size < 2) {
            System.out.println("Triangle too small. Unable to print.");
        } else {
            fillTriangle();
        }
        // печать треугольника
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size * 2; j++) {
                System.out.print(this.triangle[i][j]);
            }
            System.out.println();
        }
    }

    // заполнение массива символами
    String [][] fillTriangle() {
        int count = 1;  // начальная позиция первого символа боковой грани треугольника
        for (int i = 0; i < this.size * 2; i++) {
            triangle[this.size - 1][i] = "-";
        }
        for (int i = this.size - 2; i >= 0; i--) {
            this.triangle[i][count] = "/";
            this.triangle[i][(this.size * 2 - 1) - count] = "\\";
            count++;
        }
        return this.triangle;
    }
}
