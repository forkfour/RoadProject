package RoadOther.Road26.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main26Task2 {
    static final char POINT = ' ';
    static int UNIQUE_WORDS_COUNTER;
    static String[] words = new String[0];

    public static void main(String[] args) {
        StringBuilder inputString = getString();
        System.out.println("Array until start: " + words.length);
        countUniqueWords(inputString);
        System.out.println("Array after end: " + words.length);
        for (String s : words){
            System.out.println(s);
        }
        System.out.println("----");
        System.out.println("Total unique words: " + words.length);

    }

    static StringBuilder getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string with spaces: ");
        return new StringBuilder(scanner.nextLine());
    }

    static void countUniqueWords(StringBuilder sb) {
        int start = 0;
        int end = 0;
        if (start == sb.length()) return;
        for (int i = 0; i < sb.length(); i++) {
            start = killFirstSpaces(sb, start);
            if (start == sb.length()) return;
            end = getEndOfWord(sb, start);
            if (end == sb.length()) {
                addWordToCounter(sb.substring(start));
                return;
            }
            addWordToCounter(sb.substring(start, end));
            start = end;
            i = start;
        }

    }


    static int getEndOfWord(StringBuilder sb, int index){
        for (int i = index; i < sb.length(); i++) {
            if (sb.charAt(i) == POINT) return i;
        }
        return sb.length();
    }


    static int killFirstSpaces(StringBuilder sb, int start){
        for (int i = start; i < sb.length(); i++) {
            if (sb.charAt(i) != POINT) return i;
        }
        return sb.length();
    }

    static void addWordToCounter(String str){
        for (String s : words){
            if (s.equalsIgnoreCase(str)) return;
        }
        words = Arrays.copyOf(words, words.length + 1);
        words[words.length - 1] = str.toLowerCase();
    }
}
