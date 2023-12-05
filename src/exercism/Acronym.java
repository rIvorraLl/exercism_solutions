package exercism;

class Acronym {
    String phrase = new String();

    Acronym(String phrase) {
	this.phrase = phrase;
    }

    String get() {
	String acronym = "";
	String[] toStrArr = phrase.split("[ |-]");
	for (String str : toStrArr) {
	    for (int i = 0; i < str.length(); i++) {
		if (Character.isAlphabetic(str.charAt(i))) {
		    acronym += Character.toUpperCase(str.charAt(i));
		    i = str.length();
		}
	    }
	}
	return acronym;
    }
}
