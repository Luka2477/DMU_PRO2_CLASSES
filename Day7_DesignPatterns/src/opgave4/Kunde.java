package opgave4;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {

    private String navn;
    private int nummer;
    private static Comparator<Kunde> comparator = new KundeComparatorNavn();

    public Kunde(String navn, int nummer) {
        this.navn = navn;
        this.nummer = nummer;
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

    public static Comparator<Kunde> getComparator() {
        return comparator;
    }

    public static void setComparator(Comparator<Kunde> comparator) {
        Kunde.comparator = comparator;
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
        return comparator.compare(this, k);
    }

}
