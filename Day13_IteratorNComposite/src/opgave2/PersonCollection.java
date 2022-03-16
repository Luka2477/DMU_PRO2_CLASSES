package opgave2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class PersonCollection implements Iterable<Person> {
    // array to store the persons in;
    // persons have indices in [0, size-1]
    private final Person[] persons;
    // number of entries in the list;
    // index of the first empty slot in items
    private int size;

    private int changes = 0;

    /**
     * Creates an Collection with capacity 16.
     */
    public PersonCollection() {
        this(16);
    }

    /**
     * Creates an Collection. Requires: capacity >= 1.
     */
    public PersonCollection(int capacity) {

        this.persons = new Person[capacity];
        this.size = 0;
    }

    /**
     * Adds the entry at the end of this list.
     */
    public void add(Person person) {
        if (this.size == this.persons.length) {
            throw new RuntimeException("Collection is full");
        }

        this.persons[this.size] = person;
        this.size++;
        changes++;
    }

    /**
     * Adds the person at the index. Throws IndexOutOfBoundsException if index is
     * not in [0, size()].
     */
    public void add(int index, Person person) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(this.persons, index, this.persons, index + 1, this.size - index);
        this.persons[index] = person;
        this.size++;
        changes++;
    }

    /**
     * Removes and returns the person at the index. Throws IndexOutOfBoundsException
     * if this list is empty or index is not in [0, size()-1].
     */
    public void remove(int index) {
        if (index < 0 || index > this.size - 1 /* || size == 0 */) {
            throw new IndexOutOfBoundsException();
        }

        if (this.size - 1 - index >= 0) {
            System.arraycopy(this.persons, index + 1, this.persons, index, this.size - 1 - index);
        }
        this.persons[this.size - 1] = null;
        this.size--;
        changes++;
    }

    /**
     * Returns the person at the index. Throws IndexOutOfBoundsException if this
     * list is empty or index is not in [0, size()-1].
     */
    public Person get(int index) {
        if (index < 0 || index > this.size - 1 /* || this.size == 0 */) {
            throw new IndexOutOfBoundsException();
        }

        return this.persons[index];
    }

    /**
     * Return true if the entry is in this list.
     */
    public boolean contains(Person person) {
        boolean found = false;
        int i = 0;
        while (!found && i < this.size) {
            if (this.persons[i].equals(person)) {
                found = true;
            }
            i++;
        }
        return found;
    }

    /**
     * Returns the number of entries in this list.
     */
    public int size() {
        return this.size;
    }

    /**
     * Returns true if this list is empty.
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Removes all entries from this list.
     */
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.persons[i] = null;
        }
        this.size = 0;
        changes++;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ("[]");
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(", ").append(this.persons[i]);
        }
        sb.append("]");
        sb.delete(1, 3);
        return sb.toString();
    }

    // -------------------------------------------------------------------------

    class PersonIterator implements Iterator<Person> {

        private int personCount = 0;
        private final int localChanges;

        PersonIterator () {
            this.localChanges = changes;
        }

        @Override
        public boolean hasNext() {
            return personCount < persons.length && persons[personCount] != null;
        }

        @Override
        public Person next() {
            if (localChanges != changes) {
                throw new ConcurrentModificationException();
            }

            return persons[personCount++];
        }

    }

    // Ex. 2

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

}
