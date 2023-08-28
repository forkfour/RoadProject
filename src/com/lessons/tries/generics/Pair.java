package com.lessons.tries.generics;

public class Pair<T> {
    private T value1;
    private T value2;

    public Pair(){
        this.value1 = null;
        this.value2 = null;
    }

    public Pair(T value1, T value2 ){
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }
    public T getValue2() {
        return value2;
    }
    public void setValue1 (T value) {
        this.value1 = value;
    }
    public void setValue2(T value) {
        this.value2 = value;
    }
}
