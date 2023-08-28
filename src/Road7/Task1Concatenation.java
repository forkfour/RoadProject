package Road7;

import java.util.Arrays;
import java.util.Scanner;

public class Task1Concatenation {

    public static void main(String[] args) {
        String [] words = getArrayFromScanner();
        System.out.println(concat(words));
        System.out.println("Array\'s length: " + words.length);
    }

    static String[] getArrayFromScanner(){
        String [] result = new String[5];
        String word;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.printf("Type word #%d :", counter + 1);
            word = scanner.nextLine();
            if (word.equals("")) {
                scanner.close();
                System.out.println("Total words input: " + counter);
                return result;
            } else {
                if (result.length == counter)
                    result = Arrays.copyOf(result, result.length + 5);

                result[counter] = word;
                counter++;
            }

        }
    }

    static String concat(String [] data){
        String result = "";
        for (String i : data) {
            if (i == null) break;
            result += i + " ";
        }
        return result;
    }

}
