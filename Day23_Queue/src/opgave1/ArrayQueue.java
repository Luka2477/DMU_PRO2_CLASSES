package opgave1;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {
	private Object[] queue;
	private int last;

	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue() {
		queue = new Object[10];
		last = -1;
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return queue[0] == null;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
		last++;
		queue[last] = newElement;
		growIfNeeded();
	}

	private void growIfNeeded() {
		if (last == queue.length - 1) {
			final Object[] newQueue = new Object[queue.length*2];

			for (int i = 0; i < queue.length; i++) {
				newQueue[i] = queue[i];
			}

			queue = newQueue;
		}
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		Object ret = queue[0];
		shiftLeft();
		last--;
		return ret;
	}

	private void shiftLeft() {
		for (int i = 0; i < last; i++) {
			queue[i] = queue[i + 1];
		}

		queue[last] = null;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		return queue[0];
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		return last + 1;
	}
}
