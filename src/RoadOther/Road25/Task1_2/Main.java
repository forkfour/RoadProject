package RoadOther.Road25.Task1_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Select shape to print\n  1 - square\n  2 - triangle\nInput desired number: ");
        int shape = scanner.nextInt();
        System.out.print("Input shape size: ");
        int size = scanner.nextInt();

        if(size < 1) throw new RuntimeException("Too small!");

        String finalShape = new Main().getShape(shape, size);
        System.out.println(finalShape);

    }
    public String getShape(int shape, int size){
        EqualiteralShape equaliteralShape;
        switch (shape){
            case 1:
                equaliteralShape = new Square(size);
                break;
            case 2:
                equaliteralShape = new Triangle(size);
                break;
            default:
                throw new RuntimeException("Bad shape!");
        }
        return equaliteralShape.getShape();
    }
    public class Square implements EqualiteralShape{
        private final int length;
        public Square (int length){
            this.length = length;
        }

        @Override
        public int getLength() {
            return length;
        }

        @Override
        public String getShape() {
            return "Square under construction.";
        }
    }
    public class Triangle implements EqualiteralShape{
        private final int length;
        public Triangle (int length){
            this.length = length;
        }

        @Override
        public int getLength() {
            return length;
        }

        @Override
        public String getShape() {
            return "Triangle under construction.";
        }
    }
}
