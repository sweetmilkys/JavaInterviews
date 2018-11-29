package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _06_QuickSort {
    public List<Integer> quickSort (List<Integer> numbers) {
        if (numbers.size() < 2 ) return numbers;

        Integer pivot = numbers.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for(int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) lower.add(numbers.get(i));
            else higher.add(numbers.get(i));
        }

        List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));

        return sorted;
    }

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);

        assertEquals(Arrays.asList(1, 3, 4, 4, 5, 6, 7), quickSort(numbers));
    }
}
