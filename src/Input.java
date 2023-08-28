import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n \n Let`s input some information about you. \n \n ENTER DATA CAREFULLY \n\n");

        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.print("Weight: ");
        float weight = in.nextFloat();

        System.out.printf("Well done! \n\nOVERALL INFORMATION \n\n");


        System.out.printf("Your name is %s \nYour age is %d \nYour weight is %.2f \n\nHAVE A NICE DAY!",name, age, weight);

        in.close();
    }
}
