package opgave2;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

    private Node start;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    @Override
    public V get(K key) {
        if (size == 0) return null;

        V val = null;
        Node curr = start.next;
        while (val == null && curr != null) {
            if (curr.key.equals(key)) val = curr.value;
            else curr = curr.next;
        }

        return val;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        Node curr = start;

        while (curr.next != null) {
            if (curr.next.key.equals(key)) {
                V temp = curr.value;
                curr.value = value;
                return temp;
            } else curr = curr.next;
        }

        curr.next = new Node();
        curr.next.key = key;
        curr.next.value = value;
        return null;
    }

    @Override
    public V remove(K key) {
        if (size == 0) return null;

        Node curr = start;

        while (curr.next != null) {
            if (curr.next.key.equals(key)) {
                V temp = curr.next.value;
                curr.next = curr.next.next;
                return temp;
            } else {
                curr = curr.next;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[\n");
        Node curr = start.next;
        while (curr != null) {
            sb.append("'").append(curr.key).append("': ").append(curr.value).append("\n");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private class Node {
        Node next;
        K key;
        V value;
    }

}
