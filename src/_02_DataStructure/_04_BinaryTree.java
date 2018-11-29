package _02_DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class _04_BinaryTree {
    public class SimpleTree<E extends Comparable> implements _05_Tree<E> {
        private E value;
        private SimpleTree<E> left;
        private SimpleTree<E> right;

        public SimpleTree(E value, SimpleTree<E> left, SimpleTree<E> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public E getValue() { return value; }

        public void setValue(E value) { this.value = value; }

        public SimpleTree<E> getLeft() { return left; }

        public void setLeft(SimpleTree<E> left) { this.left = left; }

        public SimpleTree<E> getRight() { return right; }

        public void setRight(SimpleTree<E> right) { this.right = right; }

        public void insert(E toInsert) {
            if(toInsert.compareTo(value) < 0) {
                if(left == null) left = new SimpleTree<>(toInsert, null, null);
                else left.insert(toInsert);
            } else {
                if (right == null) right = new SimpleTree<>(toInsert, null, null);
                else right.insert(toInsert);
            }
        }

        public boolean search(E toFind) {
            if(toFind.equals(value)) return true;
            if(toFind.compareTo(value) < 0 && left != null) return left.search(toFind);

            return right != null && right.search(toFind);
        }
    }

    @Test
    public void test() {
        SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(1);
        root.insert(5);

        System.out.format("%4s\n", root.getValue());
        System.out.format("%6s\n", root.getLeft().getValue() + "   " + root.getRight().getValue());
        System.out.format("%s\n", root.getLeft().getLeft().getValue() + " " + root.getLeft().getRight().getValue());

        assertTrue(root.search(1));
    }
}