package opgave2.sub3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skole {

    private final String navn;

    private final Map<Integer, Studerende> studerende = new HashMap<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void addStuderende (Studerende s) {
        studerende.put(s.getStudieNr(), s);
    }

    public void removeStuderende (Studerende s) {
        studerende.remove(s.getStudieNr());
    }

    public double gennemsnit () {
        double sum = 0;

        for (int snr : studerende.keySet()) {
            sum += studerende.get(snr).getKarakterer().stream().mapToDouble(d -> d).sum();
        }

        return sum;
    }

    public Studerende findStuderende (int studieNr) {
        return studerende.get(studieNr);
    }

    @Override
    public String toString () {
        return navn;
    }
}
