package ru.itis;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    public BinarySearchTree() {
        root = null;
    }

    public void insert(T elem) {
        root = insert(elem, root);
    }

    private Node<T> insert(T elem, Node<T> root) {
        if (root == null) root = new Node<>(elem, null, null);
        if (elem.compareTo(root.elem) <= 0) {
            root.left = insert(elem, root.left);
        } else {
            root.right = insert(elem, root.right);
        }
        return root;
    }

    public boolean contains(T elem) {
        return contains(elem, root);
    }

    private boolean contains(T elem, Node<T> root) {
        if (root == null) return false;
        if (elem.compareTo(root.elem) == 0) {
            return true;
        } else if (elem.compareTo(root.elem) <= 0) {
            return contains(elem, root.left);
        } else {
            return contains(elem, root.right);
        }
    }



    public static class Node<T extends Comparable<T>> {
        T elem;
        Node<T> left;
        Node<T> right;

        public Node(T elem, Node<T> left, Node<T> right) {
            this.elem = elem;
            this.left = left;
            this.right = right;
        }

        public T getElem() {
            return elem;
        }

        public void setElem(T elem) {
            this.elem = elem;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }
}
