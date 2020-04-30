package pl_249609;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test3 {
    private zad3 test3 = new zad3("test");
    @Test
    void t1() {
        assertEquals(2,test3.połowa("java"));
    }
    @Test
    void t2() {
        assertEquals(2,test3.połowa("testy"));
    }
    @Test
    void t3() {
        assertNotEquals(3,test3.połowa("java"));
    }
}
