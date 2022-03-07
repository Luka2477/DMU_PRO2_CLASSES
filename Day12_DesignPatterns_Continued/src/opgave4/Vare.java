package opgave4;

abstract class Vare {

    private int pris;
    private String navn;

    public Vare(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }

    public int getPris() {
        return this.pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    abstract double beregnMoms();

}
