package exercism;

import java.util.HashSet;

class SumOfMultiples {
    int number;
    int[] set;

    SumOfMultiples(int number, int[] set) {
	this.number = number;
	this.set = set;
    }

    int getSum() {
	int result = 0;
	HashSet<Integer> multiples = new HashSet<Integer>();
	for (int item : set) {
	    int i = 1;
	    if (item != 0) {
		while (item * i < number) {
		    multiples.add(item * i);
		    i++;
		}
	    }
	}
	for (int n : multiples) {
	    result += n;
	}
	return result;
    }
}
