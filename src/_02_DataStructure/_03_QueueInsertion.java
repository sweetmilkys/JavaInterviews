package _02_DataStructure;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class _03_QueueInsertion {
    @Test
    public void test() {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        assertEquals("first", queue.remove());
        System.out.println(Arrays.asList("second", "third").equals(queue));

        assertEquals("second", queue.remove());
        System.out.println(Collections.singletonList("third").equals(queue));

        assertEquals("third", queue.peek());
        System.out.println(Collections.singletonList("third").equals(queue));

        assertEquals("third", queue.remove());
        System.out.println(Collections.emptyList().equals(queue));
    }
}
