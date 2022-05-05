package opgave3.a;

public class QueueDemo {
	public static void main(String[] args) {
		DequeI q = new DoubleLinkedDeque();
		q.addLast("Tom");
		q.addLast("Diana");
		q.addLast("Harry");
		q.addLast("Thomas");
		q.addLast("Bob");
		q.addFirst("Brian");
		System.out.println(q.getFirst());
		System.out.println(q.isEmpty() + " " + q.size());
		while (!q.isEmpty()) {
			System.out.println(q.removeFirst());
		}
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
		System.out.println();
		q.addLast("Anna");
		q.addLast("Lotte");
		System.out.println(q.isEmpty() + " " + q.size());
		while (!q.isEmpty()) {
			System.out.println(q.removeFirst());
		}
		System.out.println();
		System.out.println(q.isEmpty() + " " + q.size());
	}
}
