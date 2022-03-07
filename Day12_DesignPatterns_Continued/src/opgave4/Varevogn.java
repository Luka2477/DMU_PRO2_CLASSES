package opgave4;

public class Varevogn {

    public static void main(String[] args) {
        Vare iphone = new ElVare(12000, "iPhone 14S");
        Vare batteri = new ElVare(9, "AAA Batteri");
        Vare banan = new FoedeVare(10, "Banan");
        Vare vodka = new SpiritusAdapter(new Spiritus(150, "Belvedere"));

        System.out.printf("%s med pris %d har moms på %.2f%n", iphone.getNavn(), iphone.getPris(), iphone.beregnMoms());
        System.out.printf("%s med pris %d har moms på %.2f%n", batteri.getNavn(), batteri.getPris(), batteri.beregnMoms());
        System.out.printf("%s med pris %d har moms på %.2f%n", banan.getNavn(), banan.getPris(), banan.beregnMoms());
        System.out.printf("%s med pris %d har moms på %.2f%n", vodka.getNavn(), vodka.getPris(), vodka.beregnMoms());
    }

}
