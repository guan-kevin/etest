package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C {
    public void methodInC1() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.iterator().next();
    }

    public void methodInC2() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        Iterator<Integer> i = l.iterator();
        if (i.hasNext())
            i.next();
    }
}
