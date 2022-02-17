package opgave3;

public class ElectronicsMoms implements MomBeregning {

    @Override
    public double moms (double price) {
        double tax = price * 0.3;
        return price + ((tax >= 3.0) ? tax : 3);
    }

}
