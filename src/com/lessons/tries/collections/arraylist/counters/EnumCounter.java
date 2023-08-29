package com.lessons.tries.collections.arraylist.counters;

public enum EnumCounter {
    COLD_WATER_COUNTER("Cold water"),
    HOT_WATER_COUNTER("Hot water"),
    GAS_COUNTER("Gas"),
    ELECTRICITY_COUNTER("Electricity");

    private final String name;

    EnumCounter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
