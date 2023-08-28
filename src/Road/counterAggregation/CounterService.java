package Road.counterAggregation;

public class CounterService {
    static public void addCounterValue(Counter counter, int value){
        counter.count += value;
        System.out.println(counter.getName());
        System.out.printf("Counter value changed by  %d, total count is %d.\n", value, counter.count);
    }
    static public void resetCounter(Counter counter){
        counter.count = 0;
        System.out.println(counter.getName());
        System.out.println("Counter reset.");
    }
    static public void increaseCounterByOne(Counter counter){
        System.out.println(counter.getName());
        System.out.printf("Counter increased by 1. Now counter value is %d.\n", ++counter.count);
    }
    static public void getCounterList(){
        System.out.println("Overal counters quantity: " + Counter.counterQuantity);
        for (int i = 0; i < Counter.counterQuantity; i++) {
            System.out.println(i + 1 + " " + Counter.counterList[i].getName() + ", - "
                    + Counter.counterList[i].getCount() + " " + Counter.counterList[i].getMeasureType());
        }
    }
    static public void setCount(Counter counter, int value){
        counter.count = value;
        System.out.println(counter.getName());
        System.out.printf("Set counter to %d.\n", counter.count);
    }
}
