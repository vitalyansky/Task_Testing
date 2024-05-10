package Task2.Part1;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTest {

    @org.junit.Test
    public void testWhenFileIsWithOneNum() {
        int[] arr = new int[] {1};
        assertEquals(1, NumOperations._min(1, arr));
        assertEquals(1, NumOperations._max(1, arr));
        assertEquals(1, NumOperations._sum(1, arr));
        assertEquals(1, NumOperations._mult(1, arr));
    }

    @org.junit.Test
    public void testWhenFileIsFullLength() {
        int maxLen = 386662395;
        int[] arr = new int[maxLen];
        Arrays.fill(arr, 1);
        assertEquals(1, NumOperations._min(maxLen,  arr));
        assertEquals(1, NumOperations._max(maxLen, arr));
        assertEquals(maxLen, NumOperations._sum(maxLen, arr));
        assertEquals(1, NumOperations._mult(maxLen, arr));
    }
}