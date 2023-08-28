package com.road.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1regex {
    public static void main(String[] args) {
        String text = getPhoneNumber();
        System.out.println(checkNumberIsValid(text));


    }

    public static String getPhoneNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input phone number: ");
        String s = scanner.nextLine();
        scanner.close();
        return s;
    }
    public static boolean checkNumberIsValid(String text){
        Pattern pattern = Pattern.compile("\\+*\\d{11}");
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()) return true;
        else return false;
    }
}
