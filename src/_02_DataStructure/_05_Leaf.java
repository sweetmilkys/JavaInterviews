package _02_DataStructure;

public class _05_Leaf<E extends Comparable> implements _05_Tree<E> {
    private _05_Node<E> parent;

    public _05_Leaf(_05_Node<E> parent) {
        this.parent = parent;
    }

    @Override
    public void insert(E toInsert) {
        if (toInsert.compareTo(parent.getValue()) < 0) parent.setLeft(new _05_Node<>(toInsert, new _05_Leaf<>(parent), new _05_Leaf<>(parent)));
        else parent.setRight(new _05_Node<>(toInsert, new _05_Leaf<>(parent), new _05_Leaf<>(parent)));
    }

    @Override
    public boolean search(E toFind) {
        return false;
    }
}