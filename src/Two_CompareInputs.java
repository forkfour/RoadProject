import java.util.Scanner;

public class Two_CompareInputs {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Task 1: \"b*a*(a + b)/(a2)\"");
        System.out.print("Input number name \"a\": ");
        a = in.nextInt();
        System.out.print("Input number name \"b\": ");
        b = in.nextInt();

        c = b*a*(a + b)/(a * a);
        System.out.println("\"b*a*(a + b)/(a2)\" \nAnswer is: " + c);
        System.out.println("\n\n");

        System.out.println("Task 2: a^3 > b^2");
        System.out.print("Input number name \"a\": ");
        a = in.nextInt();
        System.out.print("Input number name \"b\": ");
        b = in.nextInt();
        boolean bool = a*a*a > b*b;
        System.out.println("Answer of \"a^3 > b^2\" is: " + bool);

        System.out.println("\n\n");

        System.out.println("Task 3");
        a = 1;

        b = a++;

        b += a++;

        System.out.println(b);

        in.close();
    }
}
