package opgave3;

public class NodeDropOutStack implements StackI {

    private Node first;
    private int size;
    private final int MAX_CAP;

    public NodeDropOutStack(int maxCap) {
        MAX_CAP = maxCap;
    }

    @Override
    public void push(Object element) {
        if (size == MAX_CAP) {
            Node temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        size++;
    }

    @Override
    public Object pop() {
        Node temp = first;
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
        StringBuilder sb = new StringBuilder(first.data.toString());
        Node temp = first.next;
        while (temp != null) {
            sb.append(", ").append(temp.data.toString());
            temp = temp.next;
        }
        System.out.println(sb);
    }



    private class Node {
        public Object data;
        public Node next;
    }
}
