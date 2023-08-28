package RoadOther.Road26.Task1;

import java.util.Scanner;

public class Main26Task1 {
    static StringBuilder result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = getInt(scanner, "Input rectangle width: ");
        int length = getInt(scanner, "Input rectangle length: ");
        scanner.close();

        result = new StringBuilder();
        buildHorizontal(length);
        buildVerticalMassive(length, width);
        buildHorizontal(length);
        System.out.println(result);

    }
    static int getInt(Scanner scanner, String requiredMessage){
        System.out.printf(requiredMessage);
        return scanner.nextInt();
    }
    static void buildHorizontal(int length){
        result.append('X');
        result.append("=".repeat(length - 2));
        result.append("X\n");
    }
    static void buildVerticalMassive(int length, int width){
        for (int i = 1; i < width - 1; i++) {
            result.append('|');
            result.append(" ".repeat(length - 2));
            result.append("|\n");
        }
    }
}
