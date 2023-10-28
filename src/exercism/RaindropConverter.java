package exercism;

class RaindropConverter {

    String convert(int number) {
	String result = new String();
	boolean control = false;
	if (number % 3 == 0) {
	    result += "Pling";
	    control = true;
	}
	if (number % 5 == 0) {
	    result += "Plang";
	    control = true;
	}
	if (number % 7 == 0) {
	    result += "Plong";
	    control = true;
	}
	if (!control) {
	    return String.valueOf(number);
	}
	return result;
    }
}
