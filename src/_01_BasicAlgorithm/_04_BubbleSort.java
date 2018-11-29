package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Consumer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class _04_BubbleSort {
    public Consumer<int[]> bubbleSort = numbers -> {
        boolean numbersSwitcehd;

        do {
            numbersSwitcehd = false;
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    numbersSwitcehd = true;
                }
            }
        } while (numbersSwitcehd);
    };

    @Test
    public void test() {
        int[] numbers = {4, 7, 1, 6, 3, 5, 4};

        bubbleSort.accept(numbers);
        assertArrayEquals(new int[]{1, 3, 4, 4, 5, 6, 7}, numbers);
    }
}