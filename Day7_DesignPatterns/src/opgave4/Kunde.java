package opgave4;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {

    private String navn;
    private int nummer;
    private Comparator<Kunde> comparator;

    public Kunde(String navn, int nummer, Comparator<Kunde> comparator) {
        this.navn = navn;
        this.nummer = nummer;
        this.comparator = comparator;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNummer() {
        return this.nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public Comparator<Kunde> getComparator() {
        return this.comparator;
    }

    public void setComparator(Comparator<Kunde> comparator) {
        this.comparator = comparator;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "navn='" + navn + '\'' +
                ", nummer=" + nummer +
                '}';
    }

    @Override
    public int compareTo (Kunde k) {
        return this.comparator.compare(this, k);
    }

}
