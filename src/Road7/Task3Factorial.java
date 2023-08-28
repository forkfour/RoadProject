package Road7;

import java.util.Scanner;

public class Task3Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = scanner.nextInt();
        scanner.close();

        System.out.println(getFactorial(a));
    }

    static int getFactorial(int n) {
        if (n == 1) return n;
        return n * getFactorial(n - 1);
    }

}
