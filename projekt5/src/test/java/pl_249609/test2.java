package pl_249609;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test2 {
    private zad2 test2 = new zad2(new int[]{1,2,3,4}, 0);
    @Test
    void t1() {
        assertTrue(test2.sekwencja(new int[]{8,9, 1, 2, 3,5,2}, 2));
    }
    @Test
    void t2() {
        assertFalse(test2.sekwencja(new int[]{1, 2, 3,2}, 1));
    }
    @Test
    void t3() {
        assertFalse(test2.sekwencja(new int[]{0,0,0,0}, 1));
    }
}
