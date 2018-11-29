package _01_BasicAlgorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class _02_SortObjects {
    @Test
    public void test(){
        String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};

        Arrays.sort(strings);
        assertTrue(Arrays.equals(new String[]{"abc", "x", "y", "z", "zazzy", "zzz"}, strings));
    }
}