package RoadOther.Road20.Task1.Service;

import java.util.Scanner;

public class GreetinService {


    public static String inputGreeting() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input greeting please: ");
            return scanner.nextLine();
        }
    public static String getAnswer(String input) throws InputValidationException{
        for (Answer a : Answer.values()){
            if (a.getGreeting().equals(input))
                return a.getAnswer();
        } throw new InputValidationException("Invalid input!");
    }
}
