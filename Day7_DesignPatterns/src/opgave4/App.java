package opgave4;

import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Set<Kunde> kunder = new TreeSet<>();
        kunder.add(new Kunde("Lukas", 1, new KundeComparatorNummer()));
        kunder.add(new Kunde("Ahmed", 2, new KundeComparatorNummer()));
        kunder.add(new Kunde("Mads", 3, new KundeComparatorNummer()));

        System.out.println(kunder);
    }

}
