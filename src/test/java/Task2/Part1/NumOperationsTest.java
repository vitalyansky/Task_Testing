package Task2.Part1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumOperationsTest {

    @org.junit.Test
    public void testMinFunction() {
        int[] arr = new int[] {1, 5, 9, 12, 0};
        assertEquals(0, NumOperations._min(5, arr));
    }

    @org.junit.Test
    public void testMaxFunction() {
        int[] arr = new int[] {5, 26, 98, 15};
        assertEquals(98, NumOperations._max(4, arr));
    }

    @org.junit.Test
    public void testSumFunction() {
        int[] arr = new int[] {8, 8, 7};
        assertEquals(23, NumOperations._sum(3, arr));
    }

    @org.junit.Test
    public void testMultiplyFunction() {
        int[] arr = new int[] {0, 5, 69, 17, 121, 848, 1, 65, 89, 2};
        assertEquals(0, NumOperations._mult(10, arr));
    }
}