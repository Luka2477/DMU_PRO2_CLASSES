package opgave5;

import java.util.HashSet;
import java.util.Set;

public class Saelger implements Observer {

    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public void update (Subject s) {
        Set<String> titles = new HashSet<>();

        for (Kunde k : ((BogTitel) s).getKunder()) {
            for (BogTitel b : k.getBogTitels()) {
                if (!b.getTitel().equals(((BogTitel) s).getTitel())) {
                    titles.add(b.getTitel());
                }
            }
        }

        System.out.println("Kunder har også købt:");
        System.out.println(titles);
    }

}
