package opgave3;

public class Person<E extends Comparable<E>> implements Comparable<Person<E>> {
    private E navn;

    public Person(E navn) {
        this.navn = navn;
    }

    public E getNavn() {
        return navn;
    }

    public void setNavn(E navn) {
        this.navn = navn;
    }

    @Override
    public int compareTo(Person<E> o) {
        return navn.compareTo(o.getNavn());
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn=" + navn +
                '}';
    }
}
