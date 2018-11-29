package _02_DataStructure;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class _07_TreeMapTraversal {
    @Test
    public void test() {
        Map<Integer, String> map = new TreeMap<>();
        int i = 1;
        map.put(4, "four");
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");

        for (Integer o : map.keySet()) {
            assertEquals(Integer.valueOf(i++), o);
        }
    }
}
