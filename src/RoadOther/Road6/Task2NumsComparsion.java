package RoadOther.Road6;
import java.util.Scanner;

public class Task2NumsComparsion {


    /**
     * Ввести с клавиатуры два целых числа.
     * Если первое – четное ИЛИ второе – кратно трем,
     * вывести в консоль результат сравнения этих чисел.
     * <p>
     * Если первое число кратно и двум, и трем – вывести на экран число один,
     * возведенное в степень N, где N – второе число.
     * Для возведения в степень можно использовать Math.pow().
     * В случае, если результат выражения выходит за пределы типа int
     * (допустимые значения - [-2147483648; 2147483647]) –
     * вывести сообщение «Результат выражения слишком большой!»
     * <p>
     * Также максимальное и минимальное значение int содержится в константах
     * Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
     */
        public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
            Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter a: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
            System.out.print("Enter a: ");
//        Объявляем переменную a типа int и записываем в нее значение, введенное с клавиатуры
            int a = scanner.nextInt();

//        Повторяем те же действия для b
            System.out.print("Enter b: ");
            int b = scanner.nextInt();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
            scanner.close();

//        Если а - четное ИЛИ b - кратно трем
            if (a % 2 == 0 || b % 3 == 0) {
                System.out.println(a == b);
            }

            if (a % 2 == 0 && a % 3 == 0) {    // Данную проверку можно оптимизировать как a % 6 == 0
                powNumbers(a, b);
            }
        }

        static void powNumbers(int a, int b){
            //            Записываем в переменную result результат возведения a в степень b
//            Тип double был использован, потому что Math.pow() возвращает именно его.
//            В остальном нам подошел бы и long
            double result = Math.pow(a, b);

//            Если результат превышает допустимые размеры для int
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {    //в ином случае
//                Каст к int необязателен, но позволяет избежать выведения в консоль дробной части
                System.out.println((int) result);
            }
        }

        /*
         * Примечание. Если мы попытаемся протестировать нашу программу
         * на максимально допустимых значениях: a == 2147483646 (максимальное для инта, кратное 6)
         * и b == 2147483647, результатом будет "infinity" - мы выйдем за пределы вместимости double.
         * Однако это не программе отработать корректно: все что угодно меньше, чем бесконечность:)
         */
    }
