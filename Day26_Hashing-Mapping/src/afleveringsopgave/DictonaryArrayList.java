package afleveringsopgave;

import java.util.ArrayList;

public class DictonaryArrayList<K, V> implements Dictionary<K, V> {
    private final ArrayList<V>[] dict;
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

        return (dict[i].size() == 1) ? dict[i].get(0) : null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        int i = key.hashCode() % dict.length;

        V temp = null;
        if (get(key) != null) temp = dict[i].set(0, value);
        else dict[i].add(value);
        size++;

        return (temp == null) ? value : temp;
    }

    @Override
    public V remove(K key) {
        int i = key.hashCode() % dict.length;

        V ret = (dict[i].size() == 1) ? dict[i].remove(0) : null;
        if (ret != null) size--;

        return ret;
    }

    @Override
    public int size() {
        return size;
    }
}
