package RoadOther.Road19ReWork;

import java.util.Scanner;

public class RocketScience {
    public Rocket[] rockets;
    public RocketScience (Rocket[] rockets){
        this.rockets = rockets;
    }

    public Rocket findRocket(Rocket inputRocket){
        for (Rocket r : rockets) {
            if (r.hashCode() == inputRocket.hashCode() && inputRocket.equals(r))
                return r;
        }
        return null;
    }
    public static Rocket createRocketToFind(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Rocket's name: ");
        String rName = scanner.nextLine();
        System.out.print("Input Rocket's number: ");
        String rNumber = scanner.nextLine();
        scanner.close();
        return new Rocket(rName, rNumber, "any");
    }
    public static Rocket[] generateRockets(){
        Rocket r1 = new Rocket("Falcon-9", "N001-First", "Blue");
        Rocket r2 = new Rocket("Falcon-9", "N002-Second", "Yellow");
        Rocket r3 = new Rocket("Falcon-Heavy", "H003-HV", "Silver");
        Rocket r4 = new Rocket("Falcon-Heavy", "H004-HW", "Red");
        Rocket r5 = new Rocket("Falcon-SuperX", "X005-ULT", "Blue");
        return new Rocket[]{r1, r2, r3, r4, r5};
    }
}
