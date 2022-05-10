package opgave4._2;

public class LinkedBag<E> implements Bag<E> {
    private Node first;
    private int count;

    @Override
    public int getCurrentSize() {
        return count;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean add(E newEntry) {
        Node res = new Node(newEntry, first, null);

        if (first != null) {
            first.prev = res;
        }

        first = res;
        count++;
        return true;
    }

    @Override
    public E remove() {
        E rem = first.data;

        if (first.next != null) {
            first.next.prev = null;
        }

        first = first.next;
        count--;
        return rem;
    }

    @Override
    public boolean remove(E anEntry) {
        Node curr = first;

        while (curr != null) {
            if (curr.data.equals(anEntry)) {
                if (curr.equals(first)) {
                    first = curr.next;
                }

                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                }

                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }

                count--;
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    @Override
    public void clear() {
        first = null;
        count = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int freq = 0;
        Node curr = first;

        while (curr != null) {
            if (curr.data.equals(anEntry)) {
                freq++;
            }

            curr = curr.next;
        }

        return freq;
    }

    @Override
    public boolean contains(E anEntry) {
        return getFrequencyOf(anEntry) > 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E[] toArray() {
        E[] res = (E[]) new Object[count];
        Node curr = first;
        int i = 0;

        while (curr != null) {
            res[i] = curr.data;
            curr = curr.next;
            i++;
        }

        return res;
    }


    class Node {
        public E data;
        public Node next;
        public Node prev;

        Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
