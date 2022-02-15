package opgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		// Opgave 1.a
		System.out.println(findFirst(persons, p -> p.getAge() == 44));

		// Opgave 1.b
		System.out.println(findFirst(persons, p -> p.getName().startsWith("S")));

		// Opgave 1.c
		System.out.println(findFirst(persons, Ex1::multipleIs));

		// Opgave 1.d
		System.out.println(findFirst(persons, p -> p.getName().length() == p.getAge()));

		// Opgave 1.f
		System.out.println(findAll(persons, p -> p.getName().contains("i")));

		// Opgave 1.g
		System.out.println(findAll(persons, p -> p.getName().startsWith("S")));

		// Opgave 1.h
		System.out.println(findAll(persons, p -> p.getName().length() == 5));

		// Opgave 1.i
		System.out.println(findAll(persons, p -> p.getName().length() >= 6 && p.getAge() < 40));
	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	// Opgave 1.c
	public static boolean multipleIs (Person p) {
		return p.getName().chars().filter(c -> c == 'i').count() >= 2;
	}

	// Opgave 1.e
	public static List<Person> findAll (List<Person> list, Predicate<Person> filter) {
		ArrayList<Person> arrList = new ArrayList<>();

		for (Person p : list) {
			if (filter.test(p)) {
				arrList.add(p);
			}
		}

		return arrList;
	}

}
