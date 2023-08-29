package com.lessons.tries.collections.arraylist.counters;

import java.util.ArrayList;
import java.util.List;

public class CounterService {
    public static List<Counter> counters = new ArrayList<>();

    public static void fillCountersList() {
        counters.add(new Counter(EnumCounter.COLD_WATER_COUNTER, EnumCounter.COLD_WATER_COUNTER.getName(), 100));
        counters.add(new Counter(EnumCounter.HOT_WATER_COUNTER, EnumCounter.HOT_WATER_COUNTER.getName(), 200));
        counters.add(new Counter(EnumCounter.GAS_COUNTER, EnumCounter.GAS_COUNTER.getName(), 300));
        counters.add(new Counter(EnumCounter.ELECTRICITY_COUNTER, EnumCounter.ELECTRICITY_COUNTER.getName(), 400));
    }

    public static void printAllCountersInfo(){
        for(Counter c : counters) {
            System.out.println(c);
        }
    }
    public static void addCounterInList(Counter c){
        counters.add(c);
        System.out.printf("Counter %s added in list. Total counters: %d\n", c.getType(), counters.size());
    }

/*    public static void removeCounterFromList(Counter c) {
        boolean isRemoved = counters.remove(c);
        if (isRemoved) {
            System.out.printf("Counter %s removed from list. Total counters: %d\n", c.getType(), counters.size());
        } else {
            System.out.println("Counter not found.");
        }
    }*/
public static void removeCounterFromListByIndex(int i) {
    Counter o = counters.remove(i);
    if (o != null) {
        System.out.printf("Counter %s removed from list. Total counters: %d\n", o.getType(), counters.size());
    } else {
        System.out.println("Counter not found.");
    }
}

}
