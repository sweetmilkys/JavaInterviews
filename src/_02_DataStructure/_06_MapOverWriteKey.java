package _02_DataStructure;

import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class _06_MapOverWriteKey {
    @Test
    public void overwriteKey() {
        final Map<String, String> map = new HashMap<>();
        map.put("like", "jacuzzi");

        assertEquals("jacuzzi", map.get("like"));

        map.put("like", "sauna");

        assertEquals("sauna", map.get("like"));
    }
}
