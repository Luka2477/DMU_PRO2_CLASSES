package opgave2;

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
    }

}
