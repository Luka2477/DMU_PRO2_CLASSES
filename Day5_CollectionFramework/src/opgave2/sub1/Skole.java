package opgave2.sub1;

import java.util.LinkedList;
import java.util.List;

public class Skole {

    private final String navn;

    private final List<Studerende> studerende = new LinkedList<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void addStuderende (Studerende s) {
        if (!studerende.contains(s)) {
            studerende.add(s);
        }
    }

    public void removeStuderende (Studerende s) {
        studerende.remove(s);
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
