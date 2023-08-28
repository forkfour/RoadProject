package Road.counterAggregation;

import static Road.counterAggregation.CounterService.*;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Gas", "litre");
        Counter counter2 = new Counter("Energy", "kWt");
        Counter counter3 = new Counter("Water", "litre");
        Counter counter4 = new Counter("Speed", "km/h");

        setCount(counter1, 153);
        resetCounter(counter1);
        setCount(counter1, 200);
        increaseCounterByOne(counter2);
        increaseCounterByOne(counter2);
        setCount(counter3, 132);
        increaseCounterByOne(counter3);
        addCounterValue(counter3, 7);
        setCount(counter4, 80);

        getCounterList();
    }
}
