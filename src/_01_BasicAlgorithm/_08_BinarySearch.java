package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class _08_BinarySearch {
    public boolean binarySearch(List<Integer> numbers, Integer value) {
        if(numbers == null || numbers.isEmpty()) return false;

        Integer comparison = numbers.get(numbers.size() / 2);
        if(value.equals(comparison)) return true;

        return (value < comparison) ?
                binarySearch(numbers.subList(0, numbers.size() / 2), value)
                : binarySearch(numbers.subList(numbers.size() / 2 + 1, numbers.size()), value);
    }

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        assertTrue(binarySearch(numbers, 2));
    }
}
