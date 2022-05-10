package opgave3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("Lukas Knudsen");
        System.out.println(p1.getNavn());

        Person<Navn> p2 = new Person<>(new Navn("Jeppe", "Bjerg"));
        Person<Navn> p3 = new Person<>(new Navn("Berta", "Vazquez"));
        List<Person<Navn>> pList = new ArrayList<>();
        pList.add(p2);
        pList.add(p3);
        System.out.println(pList);
        pList.sort(Person::compareTo);
        System.out.println(pList);
    }
}
