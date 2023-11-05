package exercism;

import java.util.ArrayList;
import java.util.List;

class Series {
    String string = new String();

    Series(String string) {
	this.string = string;
    }

    List<String> slices(int num) {
	if (num <= 0) {
	    throw new IllegalArgumentException("Slice size is too small.");
	}
	if (num > string.length()) {
	    throw new IllegalArgumentException("Slice size is too big.");
	}
	ArrayList<String> result = new ArrayList<String>();
	String numToStr = String.valueOf(string);
	int i = 0;
	int index = num;
	while (i + num - 1 < numToStr.length()) {
	    String subStr = numToStr.substring(i, index);
	    result.add(subStr);
	    i++;
	    index++;
	}
	return result;
    }
}
