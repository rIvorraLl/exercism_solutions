package exercism;

class RunLengthEncoding {

    String encode(String data) {
	String result = new String();
	int counter = 0;
	for (int i = 1; i < data.length(); i++) {
	    String substr = counter == 0 ? "" + data.charAt(i - 1)
		    : "" + (counter + 1) + data.charAt(i - 1);
	    if (data.charAt(i - 1) == data.charAt(i)) {
		if (i == data.length() - 1) {
		    counter++;
		    substr = counter == 0 ? "" + data.charAt(i - 1)
			    : "" + (counter + 1) + data.charAt(i - 1);
		    result += substr;
		}
		counter++;
	    } else {
		System.out.println(data.charAt(i));
		result += substr;
		counter = 0;
		substr = "";
		if (i == data.length() - 1) {
		    result += data.charAt(i);
		}
	    }
	}
	return result;
    }

    String decode(String data) {
	String result = "";
	String digits = "";
	int num = 0;
	for (int i = 0; i < data.length(); i++) {
	    if (Character.isDigit(data.charAt(i))) {
		digits += data.charAt(i);
	    }
	    if (i < data.length() - 1 && !Character.isDigit(data.charAt(i + 1))
		    && digits.length() > 0) {
		num = Integer.parseInt(digits);
		digits = "";
		String letter = "" + data.charAt(i + 1);
		result += letter.repeat(num - 1);
	    } else if (!Character.isDigit(data.charAt(i))) {
		result += data.charAt(i);
	    }
	}
	return result;
    }
}