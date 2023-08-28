package Road8;

public class Task1Counter {
    public static void main(String[] args) {
        Counter counter = new Counter("Mercury");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) counter.increaseCounter();
        }
        System.out.printf("Even numbers quantity: %d\n", counter.count);
        System.out.printf("Odd numbers quantity: %d\n", 100 - counter.count);
    }
}

class Counter {
    String model;
    int count;

    public Counter (String model, int count) {
        this.model = model;
        this.count = count;
        }
    public Counter (String model) {
        this(model, 0);
        }

    public int increaseCounter() {
        count += 1;
        return count;
    }
    public int increaseCounter(int x) {
        count += x;
        return count;
    }
    public int decreaseCounter() {
        count -= 1;
        return count;
    }
    public int decreaseCounter(int x) {
        count -= x;
        return count;
    }
}
