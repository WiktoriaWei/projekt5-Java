package pl_249609;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test4 {
   private zad4 test4 = new zad4(new int[]{4, 6, 5});
   @Test
   void t1() {
      assertArrayEquals(new int[]{6,5,4}, test4.nowatablica(new int[]{4,5,6}));
   }
   @Test
   void t2() {
      assertArrayEquals(new int[]{1}, test4.nowatablica(new int[]{1}));
   }
   @Test
   void t3() {
      assertArrayEquals(new int[]{1,4}, test4.nowatablica(new int[]{1,4})); //ten test powinien wyjść błędnie
   }
}
