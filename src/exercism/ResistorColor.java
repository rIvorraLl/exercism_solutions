package exercism;

import java.util.HashMap;

class ResistorColor {

    HashMap<String, Integer> getColorMap() {
	HashMap<String, Integer> colorCodes = new HashMap<String, Integer>();
	colorCodes.put("black", 0);
	colorCodes.put("brown", 1);
	colorCodes.put("red", 2);
	colorCodes.put("orange", 3);
	colorCodes.put("yellow", 4);
	colorCodes.put("green", 5);
	colorCodes.put("blue", 6);
	colorCodes.put("violet", 7);
	colorCodes.put("grey", 8);
	colorCodes.put("white", 9);
	return colorCodes;
    }

    int colorCode(String color) {
	final HashMap<String, Integer> colorCodes = getColorMap();
	return colorCodes.get(color);
    }

    String[] colors() {
	final String[] result = { "black", "brown", "red", "orange", "yellow",
		"green", "blue", "violet", "grey", "white" };
	return result;
    }
}
