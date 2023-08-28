package RoadOther.Task1.Cars;

public enum CarEnumTechnical {
    SEDAN("Sedan", 5, 5),
    CROSSOVER("Crossover", 5, 7),
    COUPE("Coupe", 2, 2);
    private final String TYPE;
    private final int DOOR_QUANTITY;
    private final int SEATS_QUANTITY;

    CarEnumTechnical(String type, int doorQuantity, int seatsQuantity){
        this.TYPE = type;
        this.DOOR_QUANTITY = doorQuantity;
        this.SEATS_QUANTITY = seatsQuantity;
    }
    public String getType(){return TYPE;}
    public int getDoors(){return DOOR_QUANTITY;}
    public int getSeats(){return SEATS_QUANTITY;}
}
