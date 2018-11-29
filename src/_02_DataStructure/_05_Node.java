package _02_DataStructure;

public class _05_Node<E extends Comparable> implements _05_Tree<E> {
    private E value;
    private _05_Tree<E> left;
    private _05_Tree<E> right;

    public _05_Node(E value, _05_Tree<E> left, _05_Tree<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public E getValue() { return value; }

    public void setValue(E value) { this.value = value; }

    public _05_Tree<E> getLeft() { return left; }

    public void setLeft(_05_Tree<E> left) { this.left = left; }

    public _05_Tree<E> getRight() { return right; }

    public void setRight(_05_Tree<E> right) { this.right = right; }

    @Override
    public void insert(E toInsert) {
        if (toInsert.compareTo(value) < 0) left.insert(toInsert);
        else right.insert(toInsert);
    }

    @Override
    public boolean search(E toFind) {
        if (toFind.equals(value)) return true;
        if (toFind.compareTo(value) < 0) return left.search(toFind);

        return right.search(toFind);
    }
}