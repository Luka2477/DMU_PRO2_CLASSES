package opgave3.b;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI {
    private Object[] queue;
    private int first;
    private int last;
    private int count;

    public CircularArrayDeque() {
        queue = new Object[10];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void addFirst(Object newElement) {
        growIfNeeded();
        first = (first == 0) ? queue.length - 1 : first - 1;
        queue[first] = newElement;
        count++;
    }

    @Override
    public void addLast(Object newElement) {
        growIfNeeded();
        queue[last] = newElement;
        last = (last == queue.length) ? 0 : last + 1;
        count++;
    }

    private void growIfNeeded() {
        if (count == queue.length) {
            Object[] newQueue = new Object[queue.length * 2];

            for (int i = 0; i < queue.length; i++) {
                newQueue[i] = queue[(first + i) % queue.length];
            }

            queue = newQueue;
            first = 0;
            last = count;
        }
    }

    @Override
    public Object removeFirst() {
        if (count == 0) {
            throw new NoSuchElementException();
        }

        Object ret = queue[first];
        queue[first] = null;
        first = (first == queue.length - 1) ? 0 : first + 1;
        count--;
        return ret;
    }

    @Override
    public Object removeLast() {
        if (count == 0) {
            throw new NoSuchElementException();
        }

        Object ret = queue[last - 1];
        last = (last == 0) ? queue.length - 1 : last - 1;
        queue[last] = null;
        count--;
        return ret;
    }

    @Override
    public Object getFirst() {
        if (count == 0) {
            throw new NoSuchElementException();
        }

        return queue[first];
    }

    @Override
    public Object getLast() {
        if (count == 0) {
            throw new NoSuchElementException();
        }

        return queue[last];
    }

    @Override
    public int size() {
        return count;
    }
}
