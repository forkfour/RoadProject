package com.road.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3regexClass {

    public static void main(String[] args) {
        ArrayList<String> wordsArray = new ArrayList<>();
        try {
            wordsArray = countWords();
        } catch (WrongNameException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Total unique words: " + countUniqueWords(wordsArray));
    }
    public static ArrayList<String> countWords() throws WrongNameException {
        String input = Task2regexNameReturn.getString("Input string with several words: ");
        if (input.equals("")) throw new WrongNameException("Blank field error!");
        System.out.println("Input string: " + input);

        // combine all dephys
        Pattern pattern = Pattern.compile("-{1,}");
        Matcher matcher = pattern.matcher(input);
        String inputWithOutDephys = matcher.replaceAll("-");

        // combine all spaces
        pattern = Pattern.compile("\\s{1,}");
        matcher = pattern.matcher(inputWithOutDephys);
        String inputFinal = matcher.replaceAll(" ");
        System.out.println("Final string: " + inputFinal);

        // check for invalid symbols
        pattern = Pattern.compile("[,|.|!|?]");
        matcher = pattern.matcher(inputFinal);
        if(matcher.find()) throw new WrongNameException("Invalid symbols in string!");

        // split string to array and pack into arraylist
        pattern = Pattern.compile("\\s");
        String[] words = pattern.split(inputFinal);
        ArrayList<String> wordsArray = new ArrayList<>();
        int count = 0;
        for(String s : words){
            wordsArray.add(s);
            count++;
        }
        System.out.println("Total words: " + count);
        return wordsArray;
    }
    static int countUniqueWords(ArrayList<String> inputArray){
        System.out.println("Input Array size: " + inputArray.size());
        int count = 0;
        boolean isEqual = false;
        int j = 0;
        for (String s : inputArray){
            for (int i = 0; i < inputArray.size() ; i++) {
                if (j == i) continue;
                if (s.equals(inputArray.get(i))) {
                    isEqual = true;
                }
            }
            if (!isEqual) count++;
            isEqual = false;
            j++;
        }

        return count;
    }
}