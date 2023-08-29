package com.lessons.tries.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPool {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("array list length: " + list.size());
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        System.out.println("array list length: " + list.size());
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.size());
        list.remove(4);
        System.out.println("==================");
        System.out.println(list.size());
//        arrayList.trimToSize();
        System.out.println(list.size());

        for (int a : list){
            System.out.println(a);
        }
    }
}
