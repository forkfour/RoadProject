package RoadOther.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal an1 = Animal.CAT;
        Animal an2 = Animal.DOG;
        Animal an3 = Animal.COW;
        an1.getVoice();
        an2.getVoice();
        an3.getVoice();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input animal type to get his voice (cat/cow/dog/endgame): ");
            String animalType = scanner.nextLine();
            if (animalType.equals("endgame")) {
                System.out.println("Thanks for playing!");
                break;
            }
            Animal an4 = getAnimalType(animalType);
            an4.getVoice();
        }
    }
    public static Animal getAnimalType(String animalType) {
        return switch (animalType) {
            case "cat" -> Animal.CAT;
            case "cow" -> Animal.COW;
            case "dog" -> Animal.DOG;
            default -> Animal.ERROR;
        };

    }

}
