package collections;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public void print() {
        print(root);
    }

    private void print(Node<T> root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.element + " ");
            print(root.right);
        }
    }

    public void insert(T elem) {
        root = insert(root, elem);
    }

    private Node<T> insert(Node<T> root, T value) {
        if (root == null) return new Node<>(value, null, null);
        if (value.compareTo(root.element) <= 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node<T> root, T value) {
        if (root == null) return false;
        if (root.element == value) {
            return true;
        } else if (value.compareTo(root.element) < 0) {
            return contains(root.left, value);
        } else {
            return contains(root.right, value);
        }
    }

    public boolean remove(T value) {
        return false;
    }

    private boolean remove(T value, Node<T> root) {
        return true;
    }


    public static <T extends Comparable<T>> boolean isBst(Node<T> root) {
        if (root == null) return true;
        Node<T> left = root.left;
        Node<T> right = root.right;
        if (left == null && right == null) {
            return true;
        } else if (left == null) {
            return root.element.compareTo(right.element) < 0 && isBst(right);
        } else if (right == null) {
            return root.element.compareTo(left.element) >= 0 && isBst(left);
        } else {
            return root.element.compareTo(right.element) < 0 && isBst(right) && root.element.compareTo(left.element) >= 0 && isBst(left);
        }
    }


    public static class Node<T> {
        T element;
        Node<T> left;
        Node<T> right;

        public Node(T element, Node<T> left, Node<T> right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
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
