package RoadOther.Road20.Task1;

import RoadOther.Road20.Task1.Service.GreetinService;
import RoadOther.Road20.Task1.Service.InputValidationException;

public class Main {
    public static void main(String[] args) {
        String input = GreetinService.inputGreeting();
        try {
            System.out.println(GreetinService.getAnswer(input));
        } catch (InputValidationException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getMessageReserve());
            System.out.println("Catched!");
        }
    }
}
