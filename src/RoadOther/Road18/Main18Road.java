package RoadOther.Road18;

import RoadOther.Road18.Animals.*;

public class Main18Road {
    public static void main(String[] args) {
        Animal [] animals = new Animal[]{new Animal("Beast"), new Cat("Murka"), new Dog("Shavka"), new Cow("Buronka")};

        for(Animal animal : animals ) {
            if (animal instanceof Cat) {
                System.out.print("Cat named ");
                animal.getVoice();
            }
            if (animal instanceof Dog) {
                System.out.print("Dog named ");
                animal.getVoice();
            }
            if (animal instanceof Cow) {
                System.out.print("Cow named ");
                animal.getVoice();
            }
            if (animal.getClass().equals(Animal.class)) {
                System.out.print("Some animal ");
                animal.getVoice();
            }
        }
    }
}
