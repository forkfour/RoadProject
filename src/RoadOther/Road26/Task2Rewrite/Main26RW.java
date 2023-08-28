package RoadOther.Road26.Task2Rewrite;

import java.util.Scanner;

public class Main26RW {
    public static void main(String[] args) {
        String[] s = getString();
        for (String str : s){
            System.out.println(str);
        }
        System.out.printf("Total unique words: %d\n", getUniqueWords(s));
        for (String str : s){
            System.out.println(str);
        }

    }
    static String[] getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String[] s = scanner.nextLine().toLowerCase().trim().split(" ");
        return s;
    }
    static int getUniqueWords(String[] inputString){
        int counterUniqueWords = 0;
        for (int i = 0; i < inputString.length; i++) {
            int j = 0;
            boolean isUnique = true;
            while (j < i && isUnique){
                if (inputString[i].equals(inputString[j])){
                    isUnique = false;
                } else j++;
            }
            if (isUnique) counterUniqueWords++;
        }
        return counterUniqueWords;
    }
}
