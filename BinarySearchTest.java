package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testBinarySearch1() {
        // Initialize BinarySearch object
        BinarySearch bSearch = new BinarySearch();

        // Input for the test case: array and target
        int[] codeInput = { -3, -1, 4, 7, 45, 51, 52, 70, 75, 90 }; // Array to search
        int target = 7; // Target value to find

        // Call the binarySearch method
        int[] codeOutput = bSearch.binarySearch(codeInput, target);

        // Expected output: index of the target and the number of iterations it took
        int[] expectedOutput = { 3, 4 };

        try {
            assertEquals("Test 1: Binary Search with target 7", Arrays.toString(expectedOutput),
                    Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBinarySearch2() {
        // Initialize BinarySearch object
        BinarySearch bSearch = new BinarySearch();

        // Input for the test case: array and target
        int[] codeInput = { -3, -1, 4, 7, 45, 51, 52, 70, 75, 90 }; // Array to search
        int target = 75; // Target value to find

        // Call the binarySearch method
        int[] codeOutput = bSearch.binarySearch(codeInput, target);

        // Expected output: index of the target and the number of iterations it took
        int[] expectedOutput = { 8, 3 };

        try {
            assertEquals("Test 2: Binary Search with target 17", Arrays.toString(expectedOutput),
                    Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testBinarySearch3() {
        // Initialize BinarySearch object
        BinarySearch bSearch = new BinarySearch();

        // Input for the test case: array and target
        int[] codeInput = { -3, -1, 4, 7, 45, 51, 52, 70, 75, 90 }; // Array to search
        int target = 100; // Target value that is not in the array

        // Call the binarySearch method
        int[] codeOutput = bSearch.binarySearch(codeInput, target);

        // Expected output: -1 (not found) and the number of iterations it took
        int[] expectedOutput = { -1, 4 }; // Expected index (-1) and iterations (4)

        try {
            assertEquals("Test 3: Binary Search with target 100 (not found)", Arrays.toString(expectedOutput),
                    Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
