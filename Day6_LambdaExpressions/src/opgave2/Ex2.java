package opgave2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		// Opgave 2.a
		runners.forEach(r -> System.out.printf("%s | %d%n", r.getName(), r.getLapTime()));
		System.out.println();

		// Opgave 2.b
		runners.forEach(r -> {
			if (r.getLapTime() < 30)
				System.out.printf("%s | %d%n", r.getName(), r.getLapTime());
		});
		System.out.println();

		// Opgave 2.c
		runners.sort(Comparator.comparingInt(Runner::getLapTime));
		System.out.println(runners);
	}
}