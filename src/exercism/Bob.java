package exercism;

class Bob {
    boolean checkContainsLetters(String str) {
	for (int i = 0; i < str.length(); i++) {
	    if (Character.isAlphabetic(str.charAt(i))) {
		return true;
	    }
	}
	return false;
    }

    String hey(String input) {
	boolean containsLetters = checkContainsLetters(input);
	input = input.trim();
	String deleteWhitespace = input.replaceAll(" ", "");
	if (deleteWhitespace.equals("")) {
	    return "Fine. Be that way!";
	}
	String toUpper = input.toUpperCase();
	String end = input.substring(input.length() - 1);
	if (containsLetters && toUpper.equals(input) && end.equals("?")) {
	    return "Calm down, I know what I'm doing!";
	}
	if (containsLetters && toUpper.equals(input)) {
	    return "Whoa, chill out!";
	}
	if (end.equals("?")) {
	    return "Sure.";
	}
	return "Whatever.";
    }
}