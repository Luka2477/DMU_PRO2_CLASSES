package opgave3;

import java.util.*;

public class App {

    public static void main(String[] args) {
        // Opgave 3.a
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,10,123,586,6,7));
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Opgave 3.b
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(
                2, 4,
                3, 9,
                4, 16,
                5, 25,
                6, 36));
        Iterator<Integer> iterMap = map.keySet().iterator();

        while (iterMap.hasNext()) {
            int next = iterMap.next();
            System.out.printf("(%d, %d)%n", next, map.get(next));
        }
    }

}
