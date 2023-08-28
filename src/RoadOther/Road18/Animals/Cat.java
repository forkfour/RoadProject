package RoadOther.Road18.Animals;

public class Cat extends Animal {
    private String voice = "Meow!";

    public Cat(String name){
        super(name);
    }

    @Override
    public void getVoice() {
        System.out.printf("%s speak \"%s\"\n", name, voice);
    }
}
