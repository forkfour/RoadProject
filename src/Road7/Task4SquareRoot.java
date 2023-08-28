package Road7;

import java.util.Scanner;

public class Task4SquareRoot {
    public static void main(String[] args) {
        int a = scanNumber();
        if (a < 1) System.out.println("Number less than 1! Close.");
        else System.out.println(calculateSqr(a, 1));


    }
    static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int b =  scanner.nextInt();
        scanner.close();
        return b;
    }

    // Метод просчитывает формулу sqrt(1 + sqrt(2 + sqrt(3 +.... + sqrt(n))))
    // принимая аргументы конечного числа и начального.
    static double calculateSqr(double n, double q){
        if (n == q) return Math.sqrt(n);
        return Math.sqrt(q + calculateSqr(n, q + 1));
    }
}
