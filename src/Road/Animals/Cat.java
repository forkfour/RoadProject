package Road.Animals;

public class Cat extends Animal {
    private Cat() {
        System.out.println("I'm a Cat!");
    }
    public Cat (String color) {
        System.out.printf("I'm a %s Cat!\n", color);
    }
    @Override
    public void getVoice() {
        System.out.println("Cat say \"Meow!\"");
    }
}
