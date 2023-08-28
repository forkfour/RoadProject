package RoadOther.Road18.Animals;

public class Animal {
    protected String name;
    protected String voice = "Arrr!";;

    public Animal(String name){
        this.name = name;
    }

    public void getVoice(){
        System.out.printf("%s speak \"%s\"\n", name, voice);
    }
}
