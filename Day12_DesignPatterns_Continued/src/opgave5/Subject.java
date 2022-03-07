package opgave5;

import java.util.ArrayList;

public interface Subject {

    ArrayList<Observer> OBSERVERS = new ArrayList<>();

    default void registerObserver(Observer o) {
        if (!OBSERVERS.contains(o)) {
            OBSERVERS.add(o);
        }
    }

    default void removeObserver (Observer o) {
        OBSERVERS.remove(o);
    }

}
