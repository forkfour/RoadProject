package RoadOther.Road18.Animals;

public class Cow extends Animal{
    private String voice = "Mow!";

    public Cow(String name){
        super(name);
    }

    @Override
    public void getVoice() {
        System.out.printf("%s speak \"%s\"\n", name, voice);
    }
}
