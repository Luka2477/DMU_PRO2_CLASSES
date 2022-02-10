package opgave2.sub2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Skole {

    private final String navn;

    private final Set<Studerende> studerende = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void addStuderende (Studerende s) {
        studerende.add(s);
    }

    public void removeStuderende (Studerende s) {
        studerende.remove(s);
    }

    public double gennemsnit () {
        double sum = 0;
        int count = 0;

        for (Studerende s : studerende) {
            sum += s.getKarakterer().stream().mapToDouble(d -> d).sum();
            count += s.getKarakterer().size();
        }

        return sum / count;
    }

    public Studerende findStuderende (int studieNr) {
        for (Studerende s : studerende) {
            if (s.getStudieNr() == studieNr) {
                return s;
            }
        }

        return null;
    }

    @Override
    public String toString () {
        return navn;
    }
}
