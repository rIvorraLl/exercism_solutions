package exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinarySearch {
    List<Integer> items = new ArrayList<Integer>();

    BinarySearch(List<Integer> items) {
	this.items = items;
    }

    int indexOf(int item) throws ValueNotFoundException {
	ArrayList<Integer> newItems = new ArrayList<Integer>();
	for (Integer n : items) {
	    newItems.add(n);
	}
	Collections.sort(newItems);
	if (newItems.size() == 0 || newItems.get(newItems.size() - 1) < item) {
	    throw new ValueNotFoundException("Value not in array");
	}
	int start = 0;
	int end = newItems.size() - 1;
	for (int i = 0; i < newItems.size(); i++) {
	    int pivot = (end / 2) + start;
	    if (newItems.get(pivot) == item) {
		return pivot;
	    } else if (newItems.get(pivot) < item) {
		start = pivot;
	    } else {
		end = end / 2;
	    }
	}
	throw new ValueNotFoundException("Value not in array");
    }
}
