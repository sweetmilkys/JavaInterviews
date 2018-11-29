package _02_DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _05_ComplexTree {
    @Test
    public void test() {
        final _05_Node<Integer> root = new _05_Node<>(7, null, null);
        root.setLeft(new _05_Leaf<>(root));
        root.setRight(new _05_Leaf<>(root));

        root.insert(3);
        assertTrue(root.search(3));
        assertFalse(root.search(13));
    }
}