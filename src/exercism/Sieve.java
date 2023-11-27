package exercism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Sieve {
    int maxPrime;

    Sieve(int maxPrime) {
	this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
	ArrayList<Integer> result = new ArrayList<Integer>();
	HashMap<Integer, Boolean> numbers = new HashMap<Integer, Boolean>();
	for (int i = 2; i <= maxPrime; i++) {
	    numbers.put(i, true);
	}
	for (int i = 2; i <= (int) Math.sqrt((double) maxPrime); i++) {
	    if (numbers.get(i) == true) {
		for (int j = i + i; j < numbers.size() + i; j++) {
		    if ((j) % i == 0) {
			numbers.put(j, false);
		    }
		}
	    }
	}
	for (Integer n : numbers.keySet()) {
	    if (numbers.get(n) == true) {
		result.add(n);
	    }
	}
	return result;
    }
}
