package Road17.Task2;

public enum Animal {
    CAT ("Meow!"),
    COW("Mow!"),
    DOG("Bark!");
    private final String voice;

    Animal(String voice){
        this.voice = voice;
    }
    public void getVoice(){
        System.out.println(voice);
    }
}
