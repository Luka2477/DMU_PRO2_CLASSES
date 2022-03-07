package opgave4;

public class ElVare extends Vare {

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return Math.max(getPris()*0.3, 3);
    }

}
