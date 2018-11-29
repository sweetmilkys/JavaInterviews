package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class _01_SortInts {
    @Test
    public void test() {
        int[] numbers = {-3, -5, 1, 7, 4, -2};

        Arrays.sort(numbers);
        assertTrue(Arrays.equals(new int[]{-5, -3, -2, 1, 4, 7}, numbers));
    }
}
