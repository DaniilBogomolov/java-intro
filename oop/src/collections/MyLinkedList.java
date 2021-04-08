package collections;

import java.util.NoSuchElementException;

public class MyLinkedList<E> implements List<E> {
    private Node<E> head;

    public MyLinkedList() {
    }

    public E get(int index) {
        Node<E> current = head;
        while (current != null && index != 0) {
            index--;
            current = current.next;
        }
        if (current == null) throw new NoSuchElementException();
        else return current.elem;
    }

    public static class Node<T> {
        private T elem;
        private Node<T> next;

        public Node(T elem, Node<T> next) {
            this.elem = elem;
            this.next = next;
        }

        public T getElem() {
            return elem;
        }

        public void setElem(T elem) {
            this.elem = elem;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
