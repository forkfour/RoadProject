package RoadOther.Road20.Task2.Service20;

public class Animal implements Voiceable{
    private String name;
    private String voice;

    public Animal(){
        this.name = "Animal";
        this.voice = "RRRRRRR";
    }
    public String getName(){
        return "Unknown Animal";
    }
    public void getVoice(){
        System.out.println("Rrrrrrrrrr!");
    }

}
