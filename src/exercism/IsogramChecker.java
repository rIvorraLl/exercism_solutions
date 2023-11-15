package exercism;

class IsogramChecker {

    boolean isIsogram(String phrase) {
	int counter = 0;
	for (int i = 0; i < phrase.length(); i++) {
	    for (int j = 0; j < phrase.length(); j++) {
		char ci = Character.toLowerCase(phrase.charAt(i));
		char cj = Character.toLowerCase(phrase.charAt(j));
		if (Character.isAlphabetic(ci) && Character.isAlphabetic(cj) && (ci == cj)) {
		    counter++;
		}
	    }
	    if (counter >= 2) {
		return false;
	    }
	    counter = 0;
	}
	return true;
    }
}