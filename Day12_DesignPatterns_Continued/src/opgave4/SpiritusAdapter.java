package opgave4;

public class SpiritusAdapter extends Vare {

    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus spiritus) {
        super(spiritus.getPrisen(), spiritus.getBetgenelse());
        this.spiritus = spiritus;
    }

    @Override
    double beregnMoms() {
        return spiritus.hentMoms();
    }

}
