package RoadOther.Road20.Task2.Service20;

public class Cat extends Animal{
    private String name;
    private String voice;
    public Cat(String name, String voice){
        this.name = name;
        this.voice = voice;
    }
    public void getVoice(){
        System.out.printf("%s speaks %s\n", name, voice);
    }
    public String getName(){
        return name;
    }
}
