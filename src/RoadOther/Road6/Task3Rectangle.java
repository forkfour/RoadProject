package RoadOther.Road6;

import java.util.Scanner;

public class Task3Rectangle {
    static final String VRT = "||";
    static final String HRZ = "==";
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b;

        System.out.print("Input \"Lenght\": ");
        a = scanner.nextInt();
        System.out.print("Input \"Width\": ");
        b = scanner.nextInt();
        scanner.close();

        drawRectangle(a, b);
    }

    static void drawRectangle (int horizontal, int vertical){
        if (horizontal < 2 || vertical < 2) {
            System.out.println("Both numbers must be greater than 1!");
            return;
        }
        for (int i = 1; i <= vertical; i++) {
            for (int j = 1; j <= horizontal; j++) {
                if ((j == 1 && i == 1) ||
                        (j == horizontal && i == 1) ||
                        ( j == 1 && i == vertical) ||
                        (j == horizontal && i == vertical)) {
                    System.out.print(" *");
                    if (j == horizontal)
                        System.out.println();
                }
                else if ((j == 1 || j == horizontal)) {
                    System.out.print(VRT);
                    if (j == horizontal)
                        System.out.println();
                }
                else System.out.print(HRZ);
            }
        }
    }
}
