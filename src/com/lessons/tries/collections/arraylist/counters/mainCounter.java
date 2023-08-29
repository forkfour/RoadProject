package com.lessons.tries.collections.arraylist.counters;

import java.util.ArrayList;
import java.util.List;

public class mainCounter {
    public static void main(String[] args) {
        CounterService.fillCountersList();
        CounterService.printAllCountersInfo();
        CounterService.addCounterInList(new Counter(
                EnumCounter.ELECTRICITY_COUNTER, EnumCounter.ELECTRICITY_COUNTER.getName(), 500));
        CounterService.removeCounterFromListByIndex(2);
        CounterService.printAllCountersInfo();
        List<Counter> list = new ArrayList<>();
        list = CounterService.counters.subList(1, 3);
        System.out.println("Total counters in list: " + CounterService.counters.size());
        System.out.println("Total counters in new list: " + list.size());
        for (Counter c : list){
            System.out.println(c);
        }
    }
}
