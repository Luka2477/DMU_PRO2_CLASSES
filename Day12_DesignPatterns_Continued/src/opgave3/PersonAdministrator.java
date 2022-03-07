package opgave3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {

    private static PersonAdministrator uniqueInstance;
    private Set<Person> persons = new HashSet<>();

    private PersonAdministrator () {}

    public static PersonAdministrator getInstance () {
        if (uniqueInstance == null) {
            uniqueInstance = new PersonAdministrator();
        }
        return uniqueInstance;
    }

    public void add (Person person) {
        persons.add(person);
    }

    public void remove (Person person) {
        persons.remove(person);
    }

    public HashSet<Person> getPersons () {
        return new HashSet<>(persons);
    }

}
