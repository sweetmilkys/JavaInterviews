package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;

public class _07_MergeSort {
    public List<Integer> mergeSort(List<Integer> numbers) {
        if(numbers.size() < 2) return numbers;
        return merge.apply(mergeSort(numbers.subList(0, numbers.size() / 2)), mergeSort(numbers.subList(numbers.size() / 2, numbers.size())));
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> merge = (left, right) -> {
        int leftPtr = 0, rightPtr = 0;
        List<Integer> merged = new ArrayList<>(left.size()+right.size());

        while (leftPtr < left.size() && rightPtr < right.size()) {
            if(left.get(leftPtr) < right.get(rightPtr)) {
                merged.add(left.get(leftPtr));
                leftPtr++;
            } else {
                merged.add(right.get(rightPtr));
                rightPtr++;
            }
        }
        while (leftPtr < left.size()) {
            merged.add(left.get(leftPtr));
            leftPtr++;
        }
        while (rightPtr < right.size()) {
            merged.add(right.get(rightPtr));
            rightPtr++;
        }

        return merged;
    };

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);

        assertEquals(Arrays.asList(1, 3, 4, 4, 5, 6, 7), mergeSort(numbers));
    }
}
