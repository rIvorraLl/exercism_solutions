package exercism;

class CollatzCalculator {
    int computeStepCount(int start) {
	if (start <= 0) {
	    throw new IllegalArgumentException("Only positive integers are allowed");
	}
	int result = 0;
	int n = start;
	while (n != 1) {
	    if (n % 2 == 0) {
		n = n / 2;
		result++;
	    } else {
		n = n * 3 + 1;
		result++;
	    }
	}
	return result;
    }
}