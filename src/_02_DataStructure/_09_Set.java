package _02_DataStructure;

import org.junit.Test;

import java.util.Set;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class _09_Set {
    @Test
    public void test() {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("welcome");
        set.add("goodbye");
        set.add("bye");
        set.add("hello");

        assertEquals(4, set.size());
    }
}