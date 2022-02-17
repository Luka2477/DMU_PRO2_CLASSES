package opgave3;

class Item {

    private String name;
    private double price;
    private String description;
    private MomBeregning moms;

    Item (String name, double price, String description, MomBeregning moms) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.moms = moms;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double calculatePrice () {
        return moms.moms(this.price);
    }

}
