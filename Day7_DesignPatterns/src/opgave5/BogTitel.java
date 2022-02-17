package opgave5;

import java.util.ArrayList;

public class BogTitel implements Subject {

    private String titel;
    private int antal;

    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Kunde> kunder = new ArrayList<>();

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getAntal() {
        return this.antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    @Override
    public void addObserver(Observer o) {
        if (!this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    public ArrayList<Observer> getObservers() {
        return new ArrayList<>(observers);
    }

    public void addKunde (Kunde k) {
        if (!this.kunder.contains(k)) {
            this.kunder.add(k);
            k.addBogTitel(this);
        }
    }

    public void removeKunde (Kunde k) {
        if (this.kunder.remove(k)) {
            k.removeBogTitel(this);
        }
    }

    public ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public void indkoebTilLager (int antal) {
        this.antal += antal;
    }

    public void etKoeb (Kunde k) {
        System.out.println(k.getNavn() + " har lige købt " + this.titel);
        this.addKunde(k);
        this.antal--;
        this.notifyObservers();
    }

    public void notifyObservers () {
        this.observers.forEach(o -> o.update(this));
    }

}
