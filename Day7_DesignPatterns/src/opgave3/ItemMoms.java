package opgave3;

public class ItemMoms implements MomBeregning {

    @Override
    public double moms (double price) {
        return price * 1.25;
    }

}
