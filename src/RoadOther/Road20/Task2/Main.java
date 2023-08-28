package RoadOther.Road20.Task2;

import RoadOther.Road20.Task2.Service20.*;


public class Main {
    static Animal[] animals;
    public static void main(String[] args) {
        animals = fillArray();
        System.out.println(animals[0].getName());
        System.out.println(animals[1].getName());
        System.out.println(animals[3].getName());
        checkArray(animals);
    }

    public static Animal[] fillArray(){
        Animal c1 = new Cat("Murka", "Meow!");
        Animal c2 = new Cow("Zorka", "Moow!");
        Animal c3 = new Dog("Bobik", "Bark!!");
        return new Animal[]{c1, c2, new Animal(), c3};
    }

    public static void checkArray(Animal[] animals){

        for (int i = 0; i < animals.length; i++) {
            try{
                if (animals[i] == null) throw new ArrayValidationException("Empty array index: ", i);
            } catch (ArrayValidationException ex1) {
                System.out.println(ex1.getMessage() + ex1.getArrayIndex());
                break;
            }
            try{
                switch (animals[i].getName()) {
                    case "Murka" -> {
                        System.out.println("This is a cat!");
                        animals[i].getVoice();
                    }
                    case "Zorka" -> {
                        System.out.println("This is a cow!");
                        animals[i].getVoice();
                    }
                    case "Bobik" -> {
                        System.out.println("This is a dog!");
                        animals[i].getVoice();
                    }
                    default -> {
                        System.out.println("This is an animal!");
                        throw new UnknownAnimalException("This is an unknown animal :(");
                    }
                }
            } catch (UnknownAnimalException ex2) {
                System.out.println(ex2.getMessage());
            }
        }
    }
}

