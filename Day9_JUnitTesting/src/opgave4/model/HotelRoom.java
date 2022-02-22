package opgave4.model;

import java.util.ArrayList;

public class HotelRoom {

    private int nr;
    private int price;
    private boolean single;
    private Hotel hotel;

    private ArrayList<AddOn> addOns = new ArrayList<>();

    public HotelRoom (int nr, int price, boolean single, Hotel hotel) {
        this.nr = nr;
        this.price = price;
        this.single = single;
        this.hotel = hotel;
    }

    // -------------------------------------------------------------------------------

    public int getNr () {
        return this.nr;
    }

    public void setNr (int nr) {
        this.nr = nr;
    }

    public int getPrice () {
        return this.price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public boolean isSingle () {
        return this.single;
    }

    public void setSingle (boolean single) {
        this.single = single;
    }

    // -------------------------------------------------------------------------------

    public void addAddOn (AddOn addOn) {
        if (!this.addOns.contains(addOn)) {
            this.addOns.add(addOn);
        }
    }

    public void removeAddOn (AddOn addOn) {
        this.addOns.remove(addOn);
    }

    public ArrayList<AddOn> getAddOns () {
        return new ArrayList<>(this.addOns);
    }

    // -------------------------------------------------------------------------------

    public void removeHotel () {
        this.hotel = null;
    }

    public Hotel getHotel () {
        return this.hotel;
    }

    // -------------------------------------------------------------------------------

    public double calculateAddOnPrice () {
        double AddOnsPrice = 0.0;
        for (AddOn addOn : this.addOns) {
            AddOnsPrice += addOn.getPrice();
        }
        return AddOnsPrice;
    }
}
