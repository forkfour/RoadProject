package Road28.RW.Task2;

import java.util.Objects;
import java.util.Scanner;

public class Main28RWT3 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        NumService integerNumService = new NumService<>(numbers);
        System.out.println(integerNumService.search((Integer)integerNumService.getInt()));
    }
}

class NumService<T> {
    T[] nums;

    NumService(T[] nums) {
        this.nums = nums;
    }

    T search(T i) throws StringNotFoundException {
        int counter = 0;
        for (T num : nums) {
            counter++;
            if (Objects.equals(num, i)){
                System.out.println("Value found on a position of " + counter);
                return num;
            }
        }
        throw new StringNotFoundException("Value not found!");
    }

    int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int i = scanner.nextInt();
        scanner.close();
        return i;
    }
}

