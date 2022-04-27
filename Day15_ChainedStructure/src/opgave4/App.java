package opgave4;

public class App {

    public static void main(String[] args) {
        String paris = "Paris";
        String rom = "Rom";
        String london = "London";
        String amsterdam = "Asterdam";
        String oslo = "Oslo";

        SortedLinkedList list = new SortedLinkedList();
        list.addElement(oslo);
        list.addElement(rom);
        list.addElement(london);
        list.addElement(amsterdam);
        list.addElement(paris);
        System.out.println(list.countElements());
        list.removeElement(rom);
        list.removeLast();
        System.out.println(list.countElements());
        list.udskrivElements();

        String lukas = "Lukas";
        String berta = "Berta";
        String mads = "Mads";
        String magrethe = "Magrethe";

        SortedLinkedList list2 = new SortedLinkedList();
        list2.addElement(lukas);
        list2.addElement(berta);
        list2.addElement(mads);
        list2.addElement(magrethe);

        list.addAll(list2);
        list.udskrivElements();
    }

}
