package exercism;

import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
	ArrayList<String> diamond = new ArrayList<String>();
	String vowels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String row = "";
	int vowelIndex = vowels.indexOf(a) + 1;
	int len = 2 * vowelIndex - 1;
	int l = len / 2;
	int r = len / 2 + 1;
	int charIndex = 0;
	for (int i = 0; i < vowelIndex; i++) {
	    boolean rDone = false;
	    for (int j = 0; j < len; j++) {
		if (j == l) {
		    row += vowels.charAt(charIndex);
		    l--;
		} else if (i != 0 && j == r && !rDone) {
		    row += vowels.charAt(charIndex);
		    r++;
		    rDone = true;
		} else {
		    row += " ";
		}
	    }
	    diamond.add(row);
	    charIndex++;
	    row = "";
	}
	charIndex--;
	l = len - len + 1;
	r = len - 2;
	for (int k = 0; k < vowelIndex - 1; k++) {
	    boolean lDone = false;
	    for (int x = 0; x < len; x++) {
		if (!lDone && x == l) {
		    row += vowels.charAt(charIndex - 1);
		    l++;
		    lDone = true;
		} else if (k != vowelIndex - 2 && x == r) {
		    row += vowels.charAt(charIndex - 1);
		    r--;
		} else {
		    row += " ";
		}
	    }
	    diamond.add(row);
	    charIndex--;
	    row = "";
	}
	return diamond;
    }
}