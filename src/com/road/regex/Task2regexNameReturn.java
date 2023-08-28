package com.road.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2regexNameReturn {
    public static void main(String[] args) {
        String text = getString("Input your phone number: ");
        System.out.println(checkNumberIsValid(text));

        String textString = getString("Input your full name: ");
        try {
            FullName fullName = getFullName(textString);
        fullName.printFullName();
        } catch (WrongNameException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static String getString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String s = scanner.nextLine();
        scanner.close();
        return s;
    }
    public static boolean checkNumberIsValid(String text){
        Pattern pattern = Pattern.compile("\\+*\\d{11}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    public static FullName getFullName (String text) throws WrongNameException {
        if (text.equals("")) throw new WrongNameException("Blank field error!");
        String name = "", surName = "", lastName = "";
        Pattern pattern = Pattern.compile("\\s", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);
        String[] fullName = pattern.split(text);
        if (fullName.length < 3) throw new WrongNameException
                ("String must consist of Name, Surname, Lastname!");

        for (String s: fullName){
            if (!Character.isUpperCase(s.charAt(0))) throw new WrongNameException
                    ("No capital size characters at words beginning!");
        }

        name = fullName[0];
        surName = fullName[1];
        lastName = fullName[2];

        return new FullName(name, surName, lastName);
    }
}
