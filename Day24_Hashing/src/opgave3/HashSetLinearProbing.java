package opgave3;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
	private Object[] buckets;
	private int currentSize;
	private static final String DELETED = "DELETED";

	/**
	 * Constructs a hash table.
	 *
	 * @param bucketsLength
	 *            the length of the buckets array
	 */
	public HashSetLinearProbing(int bucketsLength) {
		buckets = new Object[bucketsLength];
		currentSize = 0;
	}

	/**
	 * Tests for set membership.
	 *
	 * @param x
	 *            an object
	 * @return true if x is an element of this set
	 */
	public boolean contains(Object x) {
		boolean found = false;

		for (Object obj : buckets) {
			if (obj != null && obj.equals(x)) {
				found = true;
				break;
			}
		}

		return found;
	}

	/**
	 * Adds an element to this set.
	 *
	 * @param x
	 *            an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(Object x) {
		int hash = hashValue(x);
		boolean inserted = false;
		currentSize++;

		if (contains(x)) {
			inserted = false;
		} else {
			while (!inserted) {
				if (buckets[hash] == null || buckets[hash] == DELETED) {
					buckets[hash] = x;
					inserted = true;
				} else {
					hash = (hash + 1) % buckets.length;
				}
			}
		}

		return inserted;
	}

	/**
	 * Removes an object from this set.
	 *
	 * @param x
	 *            an object
	 * @return true if x was removed from this set, false if x was not an
	 *         element of this set
	 */
	public boolean remove(Object x) {
		int hash = hashValue(x);
		int index = (hash + 1) % buckets.length;

		if (buckets[hash].equals(x)) {
			buckets[hash] = DELETED;
			return true;
		}

		while (index != hash) {
			if (buckets[index] != null && buckets[index].equals(x)) {
				buckets[index] = DELETED;
				return true;
			}
			index = (index + 1) % buckets.length;
		}

		return false;
	}

	/**
	 * Gets the number of elements in this set.
	 *
	 * @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	private int hashValue(Object x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		return h;
	}

	// method only for test purpose
	public void writeOut() {
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(i + "\t" + buckets[i]);
		}
	}

}