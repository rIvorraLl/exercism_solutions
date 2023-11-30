package exercism;

import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {
	int indexesSum = 0;
	ArrayList<Integer> toIntegerArr = tranformIndexesArr(candidate);
	if (toIntegerArr.size() <= 1) {
	    return false;
	}
	for (int i = toIntegerArr.size() - 2; i >= 0; i = i - 2) {
	    int doubleNum = toIntegerArr.get(i) * 2 <= 9
		    ? toIntegerArr.get(i) * 2
		    : toIntegerArr.get(i) * 2 - 9;
	    toIntegerArr.set(i, doubleNum);
	}
	for (Integer num : toIntegerArr) {
	    indexesSum += num;
	}
	return indexesSum % 10 == 0;
    }

    ArrayList<Integer> tranformIndexesArr(String input) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	for (int i = 0; i < input.length(); i++) {
	    if (!Character.isDigit(input.charAt(i)) && input.charAt(i) != ' ') {
		return new ArrayList<Integer>();
	    }
	    if (Character.isDigit(input.charAt(i))) {
		result.add(input.charAt(i) - '0');
	    }
	}
	return result;
    }
}
