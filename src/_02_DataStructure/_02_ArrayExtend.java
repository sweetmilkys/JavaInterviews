package _02_DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _02_ArrayExtend {
    @Test
    public void test() {
        int[] integers = {0, 1, 2, 3, 4};
        int[] newIntegersArray = new int[integers.length + 1];
        System.arraycopy(integers, 0, newIntegersArray, 0, integers.length);
        integers = newIntegersArray;
        integers[5] = 5;

        assertEquals(5, integers[5]);
    }
}
