package opgave4;

import java.util.Comparator;

public class KundeComparatorNummer implements Comparator<Kunde> {

    @Override
    public int compare (Kunde k1, Kunde k2) {
        return k1.getNummer() - k2.getNummer();
    }

}
