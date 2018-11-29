package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;


public class _05_InsertSort {
    public Function<List<Integer>, List<Integer>> insertSort = numbers -> {
        List<Integer> sortedList = new LinkedList<>();

        originalList: for(Integer number : numbers) {
            for(int i = 0; i < sortedList.size(); i++) {
                if(number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue  originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }

        return sortedList;
    };

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);

        assertEquals(Arrays.asList(1, 3, 4, 4, 5, 6, 7), insertSort.apply(numbers));
    }
}
