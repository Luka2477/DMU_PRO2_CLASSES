package opgave3;

public class FoodMoms implements MomBeregning {

    @Override
    public double moms (double price) {
        return price * 1.05;
    }

}
