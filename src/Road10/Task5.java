package Road10;

import java.util.Scanner;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = FindPrime.findNextPrimeNumber(number, primeNumbers, i);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int sumNum = sc.nextInt();
        sc.close();

        System.out.println(sum(primeNumbers, sumNum));
    }

    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
//    заполнения одного элемента массива


    //    Метод проверки конкретного числа на то, является ли оно простым
    static public boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

    class FindPrime {
        static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
            boolean isPrime = isPrime(number, primeNumbers, currentIndex);

            if (isPrime) {
                return number;
            }

            number += 2;

            return findNextPrimeNumber(number, primeNumbers, currentIndex);
        }
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers, int sumNum) {
        return sum(numbers, sumNum);
    }

    static int sum(int[] numbers, int i, int sumNum) {

        if (i == sumNum) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}
