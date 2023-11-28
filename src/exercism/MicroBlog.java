package exercism;

class MicroBlog {
    public String truncate(String input) {
	String[] arr = input.replaceAll("\\p{So}|.", "$0\0").split("\0+");
	if (arr.length <= 5) {
	    return String.join("", arr);
	}
	String newInput = "";
	for (int i = 0; i < 5; i++) {
	    newInput += arr[i];
	}
	return newInput;
    }
}
