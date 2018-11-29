package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _03_CustomSort {
    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);

        numbers.sort((o1, o2) -> o2.compareTo(o1));
        // numbers.sort(Comparator.reverseOrder());
        System.out.println("내림차순: " + Arrays.asList(7, 6, 5, 4, 4, 3, 1).equals(numbers));
        assertEquals(Arrays.asList(7, 6, 5, 4, 4, 3, 1), numbers);

        numbers.sort((o1, o2) -> o1.compareTo(o2));
        // numbers.sort(Comparator.naturalOrder());
        System.out.println("오름차순: " + Arrays.asList(1, 3, 4, 4, 5, 6, 7).equals(numbers));
        assertEquals(Arrays.asList(1, 3, 4, 4, 5, 6, 7), numbers);
    }
}
