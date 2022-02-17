package opgave3;

class Alcohol extends Item {

    private double alcoholPercent;

    Alcohol(String name, double price, String description, MomBeregning moms, double alcoholPercent) {
        super(name, price, description, moms);

        this.alcoholPercent = alcoholPercent;
    }

}
