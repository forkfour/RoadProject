package Road17.Task2;

public enum Animal {
    CAT ("Meow!", "cat"),
    COW("Mow!", "cow"),
    DOG("Bark!", "dog"),
    ERROR("Error! Try Again!", null);
    private final String voice;
    private final String name;

    Animal(String voice, String name){
        this.voice = voice;
        this.name = name;
    }
    public void getVoice(){
        System.out.println(voice);
    }
}
