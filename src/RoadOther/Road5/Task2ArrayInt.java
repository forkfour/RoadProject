package RoadOther.Road5;

import java.util.Scanner;

public class Task2ArrayInt {
    public static void main(String[] args) {
        int [] nums = new int[5];
        Scanner scanner = new Scanner( System.in );
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number for poke " + i + " : ");
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                System.out.println(nums[0] + nums[4]);
                continue;
            }
            System.out.println(nums[i] + nums[i - 1]);

            }
        }
    }
