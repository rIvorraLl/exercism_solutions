package exercism;

class IsbnVerifier {

    String cleanString(String str) {
	if (str.length() == 0) {
	    return "incorrect";
	}
	String result = "";
	for (int i = 0; i < str.length() - 1; i++) {
	    if (Character.isDigit(str.charAt(i))) {
		result += "" + str.charAt(i);
	    } else if (str.charAt(i) != '-') {
		return "incorrect";
	    }
	}
	if (str.length() > 0) {
	    result += "" + str.charAt(str.length() - 1);
	}
	return result;
    }

    boolean isValid(String stringToVerify) {
	String str = cleanString(stringToVerify);
	int last = str.charAt(str.length() - 1);
	int n = 10;
	int sum = 0;
	if (str.length() != 10 || str.equals("incorrect")) {
	    return false;
	}
	if (str.charAt(str.length() - 1) == 'X') {
	    str = str.substring(0, str.length() - 1);
	    sum += 10;
	} else if (Character.isAlphabetic(last)) {
	    return false;
	}
	for (int i = 0; i < str.length(); i++) {
	    int num = Integer.parseInt(String.valueOf(str.charAt(i)));
	    sum += num * n;
	    n--;
	}
	if (sum % 11 == 0) {
	    return true;
	}
	return false;
    }
}
