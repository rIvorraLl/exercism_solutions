package exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    String word = new String();

    public Anagram(String word) {
	this.word = word;
    }

    public String sortStr(String str) {
	String result = new String();
	str = str.toLowerCase();
	String[] toArr = str.split("");
	Arrays.sort(toArr);
	for (String sortedLetter : toArr) {
	    result += sortedLetter;
	}
	return result;
    }

    public List<String> match(List<String> candidates) {
	List<String> result = new ArrayList<String>();
	String sortedWord = sortStr(word);
	for (String w : candidates) {
	    String sw = sortStr(w);
	    if (!word.toLowerCase().equals(w.toLowerCase()) && sw.equals(sortedWord)) {
		result.add(w);
	    }
	}
	return result;
    }
}