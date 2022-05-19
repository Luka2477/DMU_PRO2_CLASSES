package afleveringsopgave;

import java.util.ArrayList;
import java.util.Arrays;

public class DictonaryArrayList<K, V> implements Dictionary<K, V> {
    private final ArrayList<Entry>[] dict;
    private int size;

    @SuppressWarnings("unchecked")
    public DictonaryArrayList() {
        dict = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            dict[i] = new ArrayList<>();
        }
    }

    @Override
    public V get(K key) {
        int i = key.hashCode() % dict.length;

        for (Entry e : dict[i]) {
            if (e.key.equals(key)) {
                return e.val;
            }
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        int i = key.hashCode() % dict.length;

        for (Entry e : dict[i]) {
            if (e.key.equals(key)) {
                V temp = e.val;
                e.val = value;
                return temp;
            }
        }

        dict[i].add(new Entry(key, value));
        size++;
        return null;
    }

    @Override
    public V remove(K key) {
        int i = key.hashCode() % dict.length;

        for (Entry e : dict[i]) {
            if (e.key.equals(key)) {
                V temp = e.val;
                dict[i].remove(e);
                size--;
                return temp;
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
        return "DictonaryArrayList{" +
                "dict=" + Arrays.toString(dict) +
                ", size=" + size +
                '}';
    }

    class Entry {
        public K key;
        public V val;

        public Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", val=" + val +
                    '}';
        }
    }
}
