package exercism;

class PrimeCalculator {

    int nth(int nth) {
	if (nth <= 0) {
	    throw new IllegalArgumentException();
	}
	int position = 0;
	int num = 2;
	while (nth > position) {
	    boolean checkPrime = isPrime(num);
	    if (checkPrime) {
		position++;
	    }
	    if (position == nth) {
		return num;
	    }
	    num++;
	}
	return position;
    }

    public boolean isPrime(int num) {
	if (num <= 1) {
	    return false;
	}
	for (int i = 2; i < (int) Math.sqrt(num) + 1; i++) {
	    if (num % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
