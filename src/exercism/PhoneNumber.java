package exercism;

class PhoneNumber {

    String numberString = new String();

    public String onlyDigits(String str) {
	String cleaned = new String();
	if (str.charAt(0) == '1') {
	    str = str.substring(1);
	}
	for (int i = 0; i < str.length(); i++) {
	    if (!Character.isDigit(str.charAt(i))) {
	    } else {
		cleaned += "" + str.charAt(i);
	    }
	}
	if (cleaned.charAt(0) == '1' && cleaned.length() > 10) {
	    cleaned = cleaned.substring(1);
	}
	return cleaned;
    }

    PhoneNumber(String numberString) {
	int numberOfDigits = 0;
	boolean hasPunctuation = false;
	for (int i = 0; i < numberString.length(); i++) {
	    char ch = numberString.charAt(i);
	    if (Character.isAlphabetic(ch)) {
		throw new IllegalArgumentException("letters not permitted");
	    }
	    if (Character.isDigit(ch)) {
		numberOfDigits++;
	    }
	    if (ch == '@' || ch == ':' || ch == '!') {
		hasPunctuation = true;
	    }
	}
	String cleaned = onlyDigits(numberString);
	if (numberOfDigits > 11) {
	    throw new IllegalArgumentException("more than 11 digits");
	}
	if (cleaned.charAt(0) == '0') {
	    throw new IllegalArgumentException("area code cannot start with zero");
	}
	if (cleaned.charAt(0) == '1') {
	    throw new IllegalArgumentException("area code cannot start with one");
	}
	if (cleaned.charAt(3) == '0') {
	    throw new IllegalArgumentException("exchange code cannot start with zero");
	}
	if (cleaned.charAt(3) == '1') {
	    throw new IllegalArgumentException("exchange code cannot start with one");
	}
	if ((!(numberString.charAt(0) == '1') && !(numberString.charAt(1) == '1')) && numberOfDigits == 11) {
	    throw new IllegalArgumentException("11 digits must start with 1");
	}
	if (hasPunctuation) {
	    throw new IllegalArgumentException("punctuations not permitted");
	}
	if (cleaned.length() < 10) {
	    throw new IllegalArgumentException("incorrect number of digits");
	}
	if (!numberString.matches("^[2-9][0-9]{2}[2-9][0-9]{6}$")) {

	}
	this.numberString = numberString;
    }

    String getNumber() {
	numberString = onlyDigits(numberString);
	return numberString;
    }
}
// Check