package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    // Middle Pivot
    public void testQuickSort1() {
        int[] codeInput1 = { 89, 23, -90, 0, 117, 90, 2, 1, 8, -9 };
        int codeInput2 = 7;
        String codeInput3 = "middle";

        int[] codeOutput = QuickSort.quickSort(Arrays.copyOf(codeInput1, codeInput1.length), codeInput2, codeInput3);
        int[] expectedOutput = { -90, -9, 0, 1, 2, 8, 23, 89, 90, 117 };

        try {
            assertEquals("Middle pivot sort failed", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // Random Pivot
    public void testQuickSort2() {
        int[] codeInput1 = { -8, 0, 90, -12, 100, 23 };
        int codeInput2 = 10;
        String codeInput3 = "random";

        int[] codeOutput = QuickSort.quickSort(Arrays.copyOf(codeInput1, codeInput1.length), codeInput2, codeInput3);
        int[] expectedOutput = Arrays.copyOf(codeInput1, codeInput1.length);
        Arrays.sort(expectedOutput);

        try {
            assertEquals("Random pivot sort failed", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    // Invalid Iterations
    public void testQuickSort3() {
        int[] codeInput1 = { 90, -2, -11, 0, 23, 78, 9, 102, -4, 89, -9 };
        int codeInput2 = -3;
        String codeInput3 = "last";

        int[] codeOutput = QuickSort.quickSort(Arrays.copyOf(codeInput1, codeInput1.length), codeInput2, codeInput3);
        int[] expectedOutput = Arrays.copyOf(codeInput1, codeInput1.length);

        try {
            assertEquals("Invalid iteration case failed", Arrays.toString(expectedOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
