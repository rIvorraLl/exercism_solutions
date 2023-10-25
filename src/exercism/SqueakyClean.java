package exercism;

class SqueakyClean {
    static String clean(String identifier) {
	String str = identifier.replaceAll("[α-ω]", "");
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    if (Character.isISOControl(str.charAt(i))) {
		result += "" + "CTRL";
	    } else if (str.charAt(i) == ' ') {
		result += "_";
	    } else if (str.charAt(i) == '-') {
		if (Character.isDigit(str.charAt(i + 1))) {
		    result += "" + Character.toUpperCase(str.charAt(i + 2));
		    i += 2;
		} else {
		    result += "" + Character.toUpperCase(str.charAt(i + 1));
		    i++;
		}
	    } else if (Character.isLetter(str.charAt(i))) {
		result += "" + str.charAt(i);
	    }
	}
	return result;
    }
}