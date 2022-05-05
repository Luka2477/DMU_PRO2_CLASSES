package opgave3.a;

import java.util.NoSuchElementException;

public class DoubleLinkedDeque implements DequeI {
    private Node first;
    private Node last;
    private int count;

    public DoubleLinkedDeque() {}

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        count++;

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.next = first;
        first.prev = newNode;
        first = newNode;
    }

    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        count++;

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.prev = last;
        last.next = newNode;
        last = newNode;
    }

    @Override
    public Object removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Object ret = first.data;
        first = first.next;
        count--;
        if (first != null) {
            first.prev = null;
        }
        return ret;
    }

    @Override
    public Object removeLast() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Object ret = last.data;
        last = last.prev;
        count--;
        if (last != null) {
            last.next = null;
        }
        return ret;
    }

    @Override
    public Object getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    @Override
    public Object getLast() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        return last.data;
    }

    @Override
    public int size() {
        return count;
    }



    class Node {
        public Object data;
        public Node next;
        public Node prev;
    }
}
