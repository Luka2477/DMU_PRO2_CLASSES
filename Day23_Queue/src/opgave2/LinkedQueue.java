package opgave2;

import java.util.NoSuchElementException;

public class LinkedQueue implements QueueI {
    private Node first;
    private Node last;
    private int count;

    /**
     * Constructs an empty queue.
     */
    public LinkedQueue() {}

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param newElement
     *            the element to add
     */
    @Override
    public void enqueue(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        count++;

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        last.next = newNode;
        last = newNode;
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     */
    @Override
    public Object dequeue() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Object ret = first.data;
        if (first == last) {
            last = null;
        }
        first = first.next;
        count--;

        return ret;
    }

    /**
     * Returns the head of this queue. The queue is unchanged.
     *
     * @return the head element
     */
    @Override
    public Object getFront() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    /**
     * The number of elements on the queue.
     *
     * @return the number of elements in the queue
     */
    @Override
    public int size() {
        return count;
    }



    class Node {
        public Object data;
        public Node next;
    }
}
