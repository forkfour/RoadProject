package Road.Animals;

public class Main {
    Animal [] animals = new Animal[3];
    public static void main(String[] args) {
        Animal [] animals = new Animal[3];

        Dog dog = new Dog("Brown");
        Cat cat = new Cat("Black");
        Animal cow = new Cow("Spotted");

        animals[0] = dog;
        animals[1] = cat;
        animals[2] = cow;

        scream(animals);
    }
    static void scream (Animal [] animalList) {
        for (Animal i : animalList) {
            i.getVoice();
        }
    }
}
