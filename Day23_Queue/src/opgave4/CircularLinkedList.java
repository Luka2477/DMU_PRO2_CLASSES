package opgave4;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private Node first;
    private Node last;
    private int count;

    public void addPerson(Person person) {
        Node newNode = new Node(person);
        count++;

        if (first == null) {
            first = newNode;
            last = newNode;
            last.next = first;
            return;
        }

        newNode.next = first;
        last.next = newNode;
        last = newNode;
    }

    public Person remove(int count) {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Node temp = first;
        for (int i = 0; i < count - 1; i++) {
            temp = temp.next;
        }
        Node toBeRemoved = temp.next;
        temp.next = toBeRemoved.next;
        last = temp;
        first = temp.next;
        this.count--;
        return toBeRemoved.data;
    }

    public void randomStart() {
        for (int i = 0; i < Math.round(Math.random() * count); i++) {
            first = first.next;
            last = last.next;
        }
    }

    public void print() {
        if (count == 0) {
            System.out.println("The list is empty.");
            return;
        }

        Node curr = first.next;

        StringBuilder sb = new StringBuilder("[" + first.data.name);
        while (curr != first) {
            sb.append(", ").append(curr.data.name);
            curr = curr.next;
        }
        sb.append("]");
        System.out.println(sb);
    }

    public int getCount() {
        return count;
    }

    class Node {
        public Person data;
        public Node next;

        public Node(Person data) {
            this.data = data;
        }
    }
}
