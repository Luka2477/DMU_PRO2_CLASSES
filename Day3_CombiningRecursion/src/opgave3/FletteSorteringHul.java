package opgave3;

import java.util.ArrayList;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp = new ArrayList<>();

		// Flet arrays
		int i1 = low;
		int i2 = middle+1;
		while (i1 <= middle && i2 <= high) {
			if (list.get(i1) < list.get(i2)) {
				temp.add(list.get(i1++));
			} else if (list.get(i1) > list.get(i2)) {
				temp.add(list.get(i2++));
			} else {
				temp.add(list.get(i1++));
				temp.add(list.get(i2++));
			}
		}

		// Flet overskydende
		if (i1 <= middle) {
			for (; i1 <= middle; i1++) {
				temp.add(list.get(i1));
			}
		} else if (i2 <= high) {
			for (; i2 <= high; i2++) {
				temp.add(list.get(i2));
			}
		}

		// Sæt temp ind i list
		for (int i = low; i <= high; i++) {
			list.set(i, temp.get(i-low));
		}
	}

}
