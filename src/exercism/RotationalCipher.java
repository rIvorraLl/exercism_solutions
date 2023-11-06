package exercism;

class RotationalCipher {

    int shiftKey;

    RotationalCipher(int shiftKey) {
	this.shiftKey = shiftKey;
    }

    String rotate(String data) {
	String result = "";
	String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
	String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	boolean isLetter = false;
	for (int i = 0; i < data.length(); i++) {
	    for (int j = 0; j < alphabetLower.length(); j++) {
		if (data.charAt(i) == alphabetLower.charAt(j)) {
		    result += alphabetLower.charAt((j + shiftKey) % 26);
		    isLetter = true;
		    break;
		} else if (data.charAt(i) == alphabetUpper.charAt(j)) {
		    result += alphabetUpper.charAt((j + shiftKey) % 26);
		    isLetter = true;
		    break;
		}
	    }
	    if (!isLetter) {
		result += data.charAt(i);
	    }
	    isLetter = false;
	}
	return result;
    }
}