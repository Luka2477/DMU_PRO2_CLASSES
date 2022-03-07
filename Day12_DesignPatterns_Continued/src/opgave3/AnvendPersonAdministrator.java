package opgave3;

public class AnvendPersonAdministrator {

    public static void main(String[] args) {
        PersonAdministrator pa = PersonAdministrator.getInstance();

        pa.add(new Person("Lukas", 22));
        System.out.println(pa.getPersons());
        Person mads = new Person("Mads", 23);
        pa.add(mads);
        pa.add(new Person("Sidsel", 25));
        System.out.println(pa.getPersons());
        pa.remove(mads);
        System.out.println(pa.getPersons());
    }

}
