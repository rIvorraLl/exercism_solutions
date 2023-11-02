package exercism;

import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {

    String sequence = new String();

    NucleotideCounter(String sequence) throws IllegalArgumentException {
	for (int i = 0; i < sequence.length(); i++) {
	    char base = sequence.charAt(i);
	    if (!(base == 'G' || base == 'T' || base == 'A' || base == 'C')) {
		throw new IllegalArgumentException();
	    }
	}
	this.sequence = sequence;
    }

    int count(char base) {
	return 1;
    }

    Map<Character, Integer> nucleotideCounts() {
	HashMap<Character, Integer> result = new HashMap<Character, Integer>();
	result.put('A', 0);
	result.put('C', 0);
	result.put('G', 0);
	result.put('T', 0);
	for (int i = 0; i < sequence.length(); i++) {
	    char base = sequence.charAt(i);
	    result.put(base, result.get(base) + count(base));
	}
	return result;
    }
}