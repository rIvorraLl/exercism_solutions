package exercism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
	ArrayList<String> result = new ArrayList<String>();
	HashMap<String, String> codonProtein = new HashMap<String, String>();
	codonProtein.put("AUG", "Methionine");
	codonProtein.put("UUU", "Phenylalanine");
	codonProtein.put("UUC", "Phenylalanine");
	codonProtein.put("UUA", "Leucine");
	codonProtein.put("UUG", "Leucine");
	codonProtein.put("UCU", "Serine");
	codonProtein.put("UCC", "Serine");
	codonProtein.put("UCA", "Serine");
	codonProtein.put("UCG", "Serine");
	codonProtein.put("UAU", "Tyrosine");
	codonProtein.put("UAC", "Tyrosine");
	codonProtein.put("UGU", "Cysteine");
	codonProtein.put("UGC", "Cysteine");
	codonProtein.put("UGG", "Tryptophan");
	codonProtein.put("UAA", "STOP");
	codonProtein.put("UAG", "STOP");
	codonProtein.put("UGA", "STOP");
	int end = 3;
	for (int i = 0; i < rnaSequence.length(); i += 3) {
	    String codon = rnaSequence.substring(i, end);
	    if (codonProtein.get(codon).equals("STOP")) {
		return result;
	    }
	    result.add(codonProtein.get(codon));
	    end += 3;
	}
	return result;
    }
}