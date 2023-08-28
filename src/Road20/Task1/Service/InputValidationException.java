package Road20.Task1.Service;

public class InputValidationException extends Exception{
    private String messageReserve;
    public String getMessageReserve() {
        return messageReserve;
    }
    public InputValidationException(String message){
        super(message);
        this.messageReserve = message + " Shaka ponked!";
    }
}
