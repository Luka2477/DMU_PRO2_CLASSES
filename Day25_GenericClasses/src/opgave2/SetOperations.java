package opgave2;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		final Set<T> res = new HashSet<>(s1);
		res.addAll(s2);
		return res;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		final Set<T> res = new HashSet<>(s1);
		res.removeAll(s2);
		return res;
	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		final Set<T> res = new HashSet<>(s1);
		res.removeIf((el) -> !s2.contains(el));
		return res;
	}

}
