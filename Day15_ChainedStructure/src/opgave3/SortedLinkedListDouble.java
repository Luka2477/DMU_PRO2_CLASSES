package opgave3;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node newNode = new Node();
		newNode.data = e;
		size++;

		if (size == 1) {
			newNode.prev = first;
			newNode.next = last;
			first.next = newNode;
			last.prev = newNode;
			return;
		}

		Node temp = first.next;
		while (temp.next != null && temp.data.compareTo(e) < 0) {
			temp = temp.next;
		}

		newNode.prev = temp.prev;
		newNode.next = temp;
		temp.prev.next = newNode;
		temp.prev = newNode;
	}

	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		boolean found = false;

		Node temp = first.next;
		while (!found && temp != last) {
			if (temp.data.equals(e)) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				size--;
				found = true;
			} else {
				temp = temp.next;
			}
		}

		return found;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge 
	 */
	public void udskrivElements() {
		if (size == 0) {
			System.out.println("Ingen elementer i listen.");
			return;
		}

		StringBuilder sb = new StringBuilder(first.next.data);
		Node temp = first.next.next;
		while (temp != last) {
			sb.append(", ").append(temp.data);
			temp = temp.next;
		}
		System.out.println(sb);
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		if (size == 0) {
			System.out.println("Ingen elementer i listen.");
			return;
		}

		StringBuilder sb = new StringBuilder(last.prev.data);
		Node temp = last.prev.prev;
		while (temp != first) {
			sb.append(", ").append(temp.data);
			temp = temp.prev;
		}
		System.out.println(sb);
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		return size;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}
