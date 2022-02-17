package opgave3;

class Electronics extends Item {

    private double avgEnergyUsePrHour;

    Electronics(String name, double price, String description, MomBeregning moms, double avgEnergyUsePrHour) {
        super(name, price, description, moms);

        this.avgEnergyUsePrHour = avgEnergyUsePrHour;
    }

}
