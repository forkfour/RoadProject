package Road25.Retry;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainShapes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input shape type (1 for square, 2 for triangle): ");
        int shape = scanner.nextInt();
        System.out.print("Input shape size: ");
        int size = scanner.nextInt();
        String result = new MainShapes().getShape(shape, size);
        System.out.println(result);



    }
    public String getShape(int shape, int size){
        ShapesInterface sh;
        switch (shape){
            case 1:
                sh = new Square(size);
                break;
            default:
                sh = null;
        }


        return sh.getShape(size);
    }
    public class Square implements ShapesInterface{
        private int size;
        private final String HORIZONTAL_BLOCK_SYMBOL = "=";
        private final String VERTICAL_BLOCK_SYMBOL = "|";
        Square(int size){
            this.size = size;
        }
        @Override
        public String getShape(int size){
            String horizontal_line = EMPTY_SYMBOL;
            String horizontal_line_middle = VERTICAL_BLOCK_SYMBOL;
            String resultHorizonlal = EMPTY_SYMBOL;
            for (int i = 0; i < size; i++) {
                horizontal_line += HORIZONTAL_BLOCK_SYMBOL;
                }
            horizontal_line += NEXT_LINE_SYMBOL;
            for (int i = 1; i < size - 1; i++) {
                horizontal_line_middle += SPACE_SYMBOL;
                }
            horizontal_line_middle += VERTICAL_BLOCK_SYMBOL + NEXT_LINE_SYMBOL;
            for (int i = 2; i <= size - 1; i++) {
                System.out.println(i);
                resultHorizonlal += horizontal_line_middle;
                }
            return horizontal_line + resultHorizonlal + horizontal_line;
            }

        }

}
