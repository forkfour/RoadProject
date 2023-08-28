package RoadOther.Road19Insects.Insects;

public class InsectOperator {
    private static Insect[] insects;

    public static Insect[] fillInsectAray(){
        Insect insect1 = new Insect("Cockroach", Size.MIDDLE, 6);
        Insect insect2 = new Insect("Spider", Size.MIDDLE, 8);
        Insect insect3 = new Insect("Centipede", Size.BIG, 80);
        Insect insect4 = new Insect("Ladybug", Size.SMALL, 6);
        Insect insect5 = new Insect("Fly", Size.SMALL, 6);
        return new Insect[]{insect1, insect2, insect3, insect4, insect5};
    }

    public static void initializeInsects(){
        insects = fillInsectAray();
    }

    public static void getArray(){
        for (Insect i : insects){
            System.out.printf("%s, %s, %d\n", i.getName(), i.getSize(), i.getLegsNum());
        }
    }

}
