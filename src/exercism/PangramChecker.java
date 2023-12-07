package exercism;

import java.util.HashMap;

public class PangramChecker {

    public boolean isPangram(String input) {
	HashMap<String, Boolean> letters = new HashMap<String, Boolean>();
	letters.put("a", false);
	letters.put("b", false);
	letters.put("c", false);
	letters.put("d", false);
	letters.put("e", false);
	letters.put("f", false);
	letters.put("g", false);
	letters.put("h", false);
	letters.put("i", false);
	letters.put("j", false);
	letters.put("k", false);
	letters.put("l", false);
	letters.put("m", false);
	letters.put("n", false);
	letters.put("o", false);
	letters.put("p", false);
	letters.put("q", false);
	letters.put("r", false);
	letters.put("s", false);
	letters.put("t", false);
	letters.put("u", false);
	letters.put("v", false);
	letters.put("w", false);
	letters.put("x", false);
	letters.put("y", false);
	letters.put("z", false);
	for (int i = 0; i < input.length(); i++) {
	    String l = String.valueOf(input.charAt(i)).toLowerCase();
	    if (letters.containsKey(l)) {
		letters.put(l, true);
	    }
	}
	for (Boolean value : letters.values()) {
	    if (!value) {
		return false;
	    }
	}
	return true;
    }
}
