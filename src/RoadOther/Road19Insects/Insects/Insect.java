package RoadOther.Road19Insects.Insects;

public class Insect {
    private final String name;
    private Size size;
    private final int legsNum;

    public Insect(String name, Size size, int legsNum){
        this.name = name;
        this.size = size;
        this.legsNum = legsNum;
    }
    public String getName(){
        return name;
    }
    public Size getSize(){
        return size;
    }
    public int getLegsNum(){
        return legsNum;
    }
}
