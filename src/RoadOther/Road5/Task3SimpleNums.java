package RoadOther.Road5;

public class Task3SimpleNums {

    public static void main(String[] args) {
        int counter = 0;
        int[] nums = new int[10];
        int numsLine = 2;
        int check;

        while (counter < 10) {
            check = 0;
            for (int i = 2; i <= numsLine; i++) {
                if (numsLine % i == 0) {
                    check++; // увеличивает check каждый раз, когда число делится без остатка
                    // следующая строка проверяет равно ли число самому себе, нечётное и не делилось ли число без остатка более 1 раза
                    // или проверка числа на двойку
                    if ((i == numsLine && i % 2 != 0 && check < 2) || (numsLine == 2)) {
                        nums[counter] = i;
                        System.out.println("write " + nums[counter]);
                        counter++;
                    }
                }
            }
            numsLine++;
        }

        int sum = 0;
        for (int result : nums) {
            sum += result;
        }
        System.out.println("Total: " + sum);

    }
}

