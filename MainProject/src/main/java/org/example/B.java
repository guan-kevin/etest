package org.example;

import com.example.C;

public class B {
    public boolean methodInB1() {
        new C().methodInC1();
        return true;
    }

    public boolean methodInB2() {
        new C().methodInC2();
        return true;
    }
}
