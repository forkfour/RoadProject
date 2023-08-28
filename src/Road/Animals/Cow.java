package Road.Animals;

public class Cow extends Animal{
    public Cow (String color) {
        System.out.printf("I'm a %s Cow!\n", color);
    }
    @Override
    public void getVoice(){
        System.out.printf("Cow say \"Moo!\"");
    }
}
