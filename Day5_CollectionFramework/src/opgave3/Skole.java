package opgave3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Skole {

    private final String navn;

    private final Set<Studerende> studerende = new TreeSet<>(new StuderendeComparator());

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

    public Set<Studerende> getStuderende() {
        return studerende;
    }

    public double gennemsnit () {
        double sum = 0;

        for (Studerende s : studerende) {
            sum += s.getKarakterer().stream().mapToDouble(d -> d).sum();
        }

        return sum;
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
