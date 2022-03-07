package opgave5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObservableBag implements Bag, Iterable<String> {

    private final Map<String, Integer> bag = new HashMap<>();

    public ObservableBag() {
        registerObserver(new Observer() {
            @Override
            public void update(String s, int antal) {
                Observer.super.update(s, antal);
            }
        });
    }

    @Override
    public Iterator<String> iterator() {
        return bag.keySet().iterator();
    }

    @Override
    public void addString(String s) {
        int antal = bag.getOrDefault(s, 0)+1;
        bag.put(s, antal);
        notifyObservers(s, antal);
    }

    @Override
    public void removeString(String s) {
        if (bag.containsKey(s)) {
            int antal = bag.get(s)-1;
            bag.put(s, antal);
            notifyObservers(s, antal);

            if (bag.get(s) == 0) {
                bag.remove(s);
            }
        }
    }

    @Override
    public int getCount(String s) {
        return bag.get(s);
    }

    private void notifyObservers (String s, int antal) {
        OBSERVERS.forEach(o -> o.update(s, antal));
    }

}