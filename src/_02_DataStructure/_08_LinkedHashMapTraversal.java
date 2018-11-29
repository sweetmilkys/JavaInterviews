package _02_DataStructure;

import org.junit.Test;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class _08_LinkedHashMapTraversal {
    @Test
    public void test() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(4, "four");
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");

        Iterator<Integer> keys = map.keySet().iterator();
        assertEquals(Integer.valueOf(4), keys.next());
        assertEquals(Integer.valueOf(1), keys.next());
        assertEquals(Integer.valueOf(3), keys.next());
        assertEquals(Integer.valueOf(2), keys.next());
        assertFalse(keys.hasNext());
    }
}
