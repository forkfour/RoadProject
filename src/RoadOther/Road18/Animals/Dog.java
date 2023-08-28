package RoadOther.Road18.Animals;

public class Dog extends Animal{
    private String voice = "Bark!";

    public Dog(String name){
        super(name);
    }
    @Override
    public void getVoice() {
        System.out.printf("%s speak \"%s\"\n", name, voice);
    }
}
