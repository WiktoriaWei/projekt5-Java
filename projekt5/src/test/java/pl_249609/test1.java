package pl_249609;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test1 {
    private zad1 test1 = new zad1(10, 20);
    @Test
    void t1() {
        assertTrue(test1.temperatura(5,55));
    }
    @Test
    void t2() {
        assertTrue(test1.temperatura(101,11));
    }
    @Test
    void t3() {
        assertFalse(test1.temperatura(100,200));
    }
}
