package exercism;

import java.util.HashMap;

class BottleSong {

    String recite(int startBottles, int takeDown) {
	String result = "";
	HashMap<Integer, String> numbers = new HashMap<Integer, String>();
	numbers.put(10, "Ten");
	numbers.put(9, "Nine");
	numbers.put(8, "Eight");
	numbers.put(7, "Seven");
	numbers.put(6, "Six");
	numbers.put(5, "Five");
	numbers.put(4, "Four");
	numbers.put(3, "Three");
	numbers.put(2, "Two");
	numbers.put(1, "One");
	for (int i = 0; i < takeDown; i++) {
	    String numOrNone = startBottles > 1
		    ? numbers.get(startBottles - 1).toLowerCase()
		    : "no";
	    String bottleSgOrPl = startBottles > 1 ? "bottles" : "bottle";
	    String bottlePlorSg = startBottles == 2 ? "bottle" : "bottles";
	    String addPgBreak = i < takeDown - 1 ? "\n" : "";
	    result += numbers.get(startBottles) + " green " + bottleSgOrPl
		    + " hanging on the wall,\n" + numbers.get(startBottles)
		    + " green " + bottleSgOrPl + " hanging on the wall,\n"
		    + "And if one green bottle should accidentally fall,\n"
		    + "There'll be " + numOrNone + " green " + bottlePlorSg
		    + " hanging on the wall.\n" + addPgBreak;
	    startBottles--;
	}
	return result;
    }
}