package afleveringsopgave;

import java.util.HashMap;
import java.util.Map;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

    private static final int N = 10;
    private final Map<K, V>[] tabel;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    @SuppressWarnings("unchecked")
    public DictionaryHashMap() {
        tabel = new HashMap[N];
        for (int i = 0; i < N; i++) {
            tabel[i] = new HashMap<>();
        }
    }

    @Override
    public V get(K key) {
        int i = key.hashCode() % N;
        Map<K, V> m = tabel[i];
        return m.get(key);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        int i = key.hashCode() % N;
        V val = tabel[i].put(key, value);

        if (val == null) size++;

        return val;
    }

    @Override
    public V remove(K key) {
        int i = key.hashCode() % N;
        V val = tabel[i].remove(key);

        if (val != null) size--;

        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
