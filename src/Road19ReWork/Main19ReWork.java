package Road19ReWork;

import java.util.Scanner;

public class Main19ReWork {
    public static void main(String[] args) {
        RocketScience rocketPack = new RocketScience(RocketScience.generateRockets());
        Rocket rocket = RocketScience.createRocketToFind();
        System.out.println(rocketPack.findRocket(rocket));
        rocketPack.findRocket(rocket).changeColor("Black");
        System.out.println(rocketPack.findRocket(rocket));
    }
}
