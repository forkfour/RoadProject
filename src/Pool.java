import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Pool {
    public static void main(String[] args) throws InterruptedException {
        int n = 13;
        int[] result = deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 );
        for(int i : result){
            System.out.println(i);
        }

    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        int[] result = new int[]{elements[0]};
        int newLength = 0;
        boolean isOver = false;

        for (int i = 0; i < elements.length; i++) {
            int count = 0;
            newLength++;
            System.out.println("length: " + newLength);
            for (int digit : elements) {
                if (digit == elements[i] && count < maxOccurrences) {
                    count++;
                    System.out.println("count: " + count);
                if (count == maxOccurrences){
                    isOver = true;
                    break;
                    }
                }
            }
            if (isOver) {
                break;

            }
        }
        result = Arrays.copyOf(elements, newLength);

        return result;
    }
}
