package exercism;

class LargestSeriesProductCalculator {
    String inputNumber = new String();

    LargestSeriesProductCalculator(String inputNumber) {
	if (!inputNumber.chars().allMatch(Character::isDigit)) {
	    throw new IllegalArgumentException("String to search may only contain digits.");
	}
	this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
	if (numberOfDigits > inputNumber.length()) {
	    throw new IllegalArgumentException(
		    "Series length must be less than or equal to the length of the string to search.");
	}
	if (numberOfDigits < 0) {
	    throw new IllegalArgumentException("Series length must be non-negative.");
	}
	long result = 0;
	long prov = 0;
	for (int i = 0; i <= inputNumber.length() - numberOfDigits; i++) {
	    String subStr = inputNumber.substring(i, i + numberOfDigits);
	    prov = subStr.charAt(0) - '0';
	    for (int j = 1; j < subStr.length(); j++) {
		int n = subStr.charAt(j) - '0';
		prov = prov * n;
	    }
	    if (prov > result) {
		result = prov;
	    }
	}
	return result;
    }
}