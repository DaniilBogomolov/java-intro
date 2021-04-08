package ru.itis;

public class Main {

    static <T> void reverse(Node<T> head) {
        Node<T> current = head;
        Node<T> prev = null;
        Node<T> next = current.getNext();
        while (current.getNext() != null) {
            current.setNext(prev);
            prev = current;
            current = next;
            next = current.getNext();
        }
        current.setNext(prev);
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(5);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);

        Node<Integer> current = e;
        reverse(a);
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }
}
