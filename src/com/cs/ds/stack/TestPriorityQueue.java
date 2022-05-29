package com.cs.ds.stack;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<String> q= new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) return -1;
                else if (o1.length() > o2.length()) return 1;
                else return 0;
            }
        });
        q.add("Cat");
        q.add("Horse");
        q.add("Hippopotamous");
        q.add("Fish");

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
