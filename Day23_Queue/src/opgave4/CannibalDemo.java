package opgave4;

public class CannibalDemo {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addPerson(new Person("Lukas", 22));
        cll.addPerson(new Person("Sidsel", 29));
        cll.addPerson(new Person("Nicolai", 29));
        cll.addPerson(new Person("Mads", 24));
        cll.addPerson(new Person("Catalin", 26));
        cll.addPerson(new Person("Mikkel Victor", 30));
        cll.addPerson(new Person("Cilie", 26));
        cll.addPerson(new Person("Berta", 20));
        cll.addPerson(new Person("Lasse", 26));
        cll.addPerson(new Person("Jeppe", 24));
        cll.addPerson(new Person("Dorte", 59));

        cll.randomStart();

        cll.print();
        while (cll.getCount() != 0) {
            System.out.println(cll.remove(5).name);
        }
        cll.print();
    }
}
