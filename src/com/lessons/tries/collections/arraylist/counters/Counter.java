package com.lessons.tries.collections.arraylist.counters;

public class Counter {
    private EnumCounter type;
    private String name;
    private int value;

    public Counter(EnumCounter type, String name, int value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public EnumCounter getType() {
        return type;
    }

    @Override
    public String toString() {
        return "=====\nName: %s\nType: %s\nValue: %d\n".formatted(name, type, value);
    }
}
