package opgave2;

public class SortedLinkedList {

	private Node first;

	public SortedLinkedList() {
		first = null;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node newNode = new Node();
		newNode.data = e;

		if (first == null) {
			first = newNode;
			return;
		}

		Node temp = first;
		if (temp.data.compareTo(e) >= 0) {
			first = newNode;
			newNode.next = temp;
			return;
		}

		while (temp.next != null) {
			if (temp.next.data.compareTo(e) >= 0) {
				break;
			} else {
				temp = temp.next;
			}
		}

		Node temp2 = temp.next;
		temp.next = newNode;
		newNode.next = temp2;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge
	 */
	public void udskrivElements() {
		if (first == null) {
			System.out.println("Ingen elementer i listen.");
			return;
		}

		StringBuilder sb = new StringBuilder(first.data);
		Node temp = first.next;
		while (temp != null) {
			sb.append(", ").append(temp.data);
			temp = temp.next;
		}
		System.out.println(sb);
	}
	
	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		int count = 0;
		Node temp = first;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	
	/**
	 * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis der blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeLast() {
		if (first == null) {
			return false;
		} else if (first.next == null) {
			first = null;
			return true;
		}

		Node secondLast = first;
		Node last = first.next;
		while (last.next != null) {
			secondLast = last;
			last = last.next;
		}
		secondLast.next = null;
		return true;
	}
	
	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		boolean found = false;

		if (first != null) {
			if (first.data.equals(e)) {
				first = first.next;
				found = true;
			} else {
				Node temp = first;
				while (!found && temp.next != null) {
					if (temp.next.data.equals(e)) {
						found = true;
					} else {
						temp = temp.next;
					}
				}
				if (found) {
					Node temp2 = temp.next;
					temp.next = temp2.next;
					temp2.next = null;
				}
			}
		}

		return found;
	}

	
	
	// Privat indre klasse der modellerer en node i listen
	private class Node {
		public String data;
		public Node next;
	}
}
