package opgave1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnvendMetoderPaaHashSet {



    public static void main(String[] args) {
        // Opgave 1.1 og 1.2
        Set<Integer> set = new HashSet<>(Arrays.asList(34, 12, 23, 45, 67, 34, 98));

        // Opgave 1.3
        System.out.println(set);

        // Opgave 1.4
        set.add(23);

        // Opgave 1.5
        System.out.println(set);

        // Opgave 1.6
        set.remove(67);

        // Opgave 1.7
        System.out.println(set);

        // Opgave 1.8
        // [34, 98, 23, 12, 45]
        // Ja, det gør det.

        // Opgave 1.9
        System.out.println(set.size());
    }

}
