package exercism;

public class Hamming {
    String leftStrand = new String();
    String rightStrand = new String();

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
	this.leftStrand = leftStrand;
	this.rightStrand = rightStrand;
	if (leftStrand.length() == 0 && rightStrand.length() > 0) {
	    throw new IllegalArgumentException("left strand must not be empty.");
	} else if (rightStrand.length() == 0 && leftStrand.length() > 0) {
	    throw new IllegalArgumentException("right strand must not be empty.");
	}
	if (leftStrand.length() != rightStrand.length()) {
	    throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
	}
    }

    public int getHammingDistance() {
	int distance = 0;
	for (int i = 0; i < leftStrand.length(); i++) {
	    if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
		distance++;
	    }
	}
	return distance;
    }
}
