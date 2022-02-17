package opgave5;

import java.util.ArrayList;

public class Kunde {

    private String navn;

    private ArrayList<BogTitel> bogTitels = new ArrayList<>();

    public Kunde(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addBogTitel (BogTitel b) {
        if (!this.bogTitels.contains(b)) {
            this.bogTitels.add(b);
        }
    }

    public void removeBogTitel (BogTitel b) {
        this.bogTitels.remove(b);
    }

    public ArrayList<BogTitel> getBogTitels() {
        return this.bogTitels;
    }

}
