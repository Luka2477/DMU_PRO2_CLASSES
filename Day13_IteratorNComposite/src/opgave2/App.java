package opgave2;

public class App {

    public static void main(String[] args) {

        // TEST
        PersonCollection pc = new PersonCollection();
        pc.add(new Person("Lukas"));
        pc.add(new Person("Berta"));
        pc.add(1, new Person("Mads"));
        System.out.println(pc);
        pc.remove(1);
        System.out.println(pc);
        System.out.println("Berta | " + pc.get(1));
        System.out.println("2 | " + pc.size());
        System.out.println("true | " + pc.contains(new Person("Lukas")));
        System.out.println("false | " + pc.isEmpty());
        System.out.println(pc);
        pc.clear();
        System.out.println(pc);

        // Ex 3

        pc.add(new Person("Lukas"));
        pc.add(new Person("Berta"));
        pc.add(1, new Person("Mads"));
        for (Person person : pc) {
            System.out.println(person);
        }
    }

}
