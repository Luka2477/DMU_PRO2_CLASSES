package opgave2.sub1;

import java.util.LinkedList;
import java.util.List;

public class Studerende {

    private final int studieNr;
    private String navn;

    private final List<Integer> karakterer = new LinkedList<>();

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return this.studieNr;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn (String navn) {
        this.navn = navn;
    }

    public void addKarakter (int karakter) {
        karakterer.add(karakter);
    }

    public List<Integer> getKarakterer() {
        return new LinkedList<>(karakterer);
    }

    @Override
    public String toString () {
        return studieNr + " " + navn;
    }
}
