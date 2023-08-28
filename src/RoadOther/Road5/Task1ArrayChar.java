package RoadOther.Road5;

public class Task1ArrayChar {
    public static void main(String[] args) {
        char [] name;
        name = new char[] {'R', 'o', 'm', 'a', 'n'};

        for (char ch : name) {
            System.out.print(ch);
        }

        String s = "";
        for (int i = 0; i < name.length; i++) {
            s += name[i];
        }
        System.out.println("\n" + s);
    }
}
