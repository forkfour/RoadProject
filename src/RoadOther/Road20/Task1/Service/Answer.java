package RoadOther.Road20.Task1.Service;

public enum Answer {
    HI("Hi","Hello"),
    BYE("Bye", "Good Bye!"),
    HOW("How are you", "I'm fine, thank you!"),
    ERROR(null, "Unknown message");

    private final String greeting;
    private final String answer;

    Answer(String greeting, String answer){
        this.greeting = greeting;
        this.answer = answer;
    }
    public String getAnswer(){
        return answer;
    }
    public String getGreeting(){
        if (greeting == null) return "null";
        return greeting;
    }
}
