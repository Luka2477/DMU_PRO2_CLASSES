package opgave5;

public class Indkoeber implements Observer {

    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        if (((BogTitel) s).getAntal() < 6) {
            System.out.println("Der skal bestilles 10 af " + ((BogTitel) s).getTitel());
            ((BogTitel) s).indkoebTilLager(10);
            System.out.println("Der er købt 10 af " + ((BogTitel) s).getTitel() + " til lageret");
        }
    }

}
