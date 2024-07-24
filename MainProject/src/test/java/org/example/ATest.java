package org.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ATest {
    @Test
    public void testA() {
        A a = new A();
        assertTrue(a.methodInA());
    }
}
