package Road.Animals;

public class Dog extends Animal {
    private Dog() {
        System.out.println("I'm a Dog!");
    }
    public Dog (String color) {
        System.out.printf("I'm a %s Dog!\n", color);
    }
    @Override
    public void getVoice() {
        System.out.println("Dog say \"Woof\"");
    }
}
