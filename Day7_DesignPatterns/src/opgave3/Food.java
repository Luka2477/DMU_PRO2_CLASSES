package opgave3;

class Food extends Item {

    private int shelfLife;

    Food(String name, double price, String description, MomBeregning moms, int shelfLife) {
        super(name, price, description, moms);

        this.shelfLife = shelfLife;
    }

}
