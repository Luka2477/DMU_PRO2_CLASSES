package opgave3;

public class NodeDoubleDropOutStack implements StackI {

    private Node first;
    private Node last;
    private int size;
    private final int MAX_CAP;

    public NodeDoubleDropOutStack(int maxCap) {
        first = null;
        last = null;
        size = 0;
        MAX_CAP = maxCap;
    }

    @Override
    public void push(Object element) {
        if (size == MAX_CAP) {
            last = last.prev;
            last.next = null;
            size--;
        }

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;

        if (first != null) {
            first.prev = newNode;
        }

        first = newNode;

        if (first.next == null) {
            last = first;
        }

        size++;
    }

    @Override
    public Object pop() {
        Node temp = first;
        first.next.prev = null;
        first = first.next;
        size--;
        return temp.data;
    }

    @Override
    public Object peek() {
        return first.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void print() {
        StringBuilder sb = new StringBuilder(last.data.toString());
        Node temp = last.prev;
        while (temp != null) {
            sb.append(", ").append(temp.data.toString());
            temp = temp.prev;
        }
        System.out.println(sb);
    }



    private class Node {
        public Object data;
        public Node next;
        public Node prev;
    }
}
