package opgave4;

import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Set<Kunde> kunder = new TreeSet<>();

        kunder.add(new Kunde("Lukas", 1));
        kunder.add(new Kunde("Ahmed", 2));
        kunder.add(new Kunde("Mads", 3));
        System.out.println(kunder);

        kunder.clear();
        Kunde.setComparator(new KundeComparatorNummer());
        kunder.add(new Kunde("Lukas", 1));
        kunder.add(new Kunde("Ahmed", 2));
        kunder.add(new Kunde("Mads", 3));
        System.out.println(kunder);
    }

}
