package exercism;

import java.util.HashMap;
import java.util.Map;

class WordCount {
    public String[] cleanupAndStrToStrArr(String input) {
	// Check if the string is a list with no spaces ("1,2,3")
	if (input.indexOf(" ") == -1) {
	    String removeQuotes = input.replaceAll("[\"]", "");
	    return removeQuotes.split(",");
	}
	// Remove unwanted characters, and switch line break to space
	String cleanup = input.replaceAll("[\"|:|;|!|?|.|,|&|@|\\$|%|\\^|&]", "");
	cleanup = cleanup.replaceAll("\\n", " ");
	String[] arr = cleanup.split(" ");
	return arr;
    }
    
    public String[] removeWhitespaceAndSingleQuotes(String[] arr) {
	String[] newArr = new String[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = arr[i].trim();
	    // Do not check if string length == 0. Else remove single quotes
	    if (arr[i].length() == 0) {
		assert false;
	    } else if (arr[i].charAt(0) == '\'' && arr[i].charAt(arr[i].length() - 1) == '\'') {
		arr[i] = arr[i].substring(1, arr[i].length() - 1);
	    } else if (arr[i].charAt(0) == '\'') {
		arr[i] = arr[i].substring(1);
	    } else if (arr[i].charAt(arr[i].length() - 1) == '\'') {
		arr[i] = arr[i].substring(0, arr[i].length() - 1);
	    }
	    if (arr[i].length() > 0) {
		newArr[i] = arr[i].toLowerCase();		
	    }
	}
	return newArr;
    }

    public Map<String, Integer> phrase(String input) {
	Map<String, Integer> result = new HashMap<>();
	String[] arr = cleanupAndStrToStrArr(input);
	String[] newArr = removeWhitespaceAndSingleQuotes(arr);
	for (String str : newArr) {
	    if (str == null) {
		assert false;
	    } else if (result.containsKey(str)) {
		result.put(str, result.get(str) + 1);
	    } else {
		result.put(str, 1);
	    }
	}
	return result;
    }
}