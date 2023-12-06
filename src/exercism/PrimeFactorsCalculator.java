package exercism;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {
    public List<Long> calculatePrimeFactorsOf(long number) {
	List<Long> list = new ArrayList<Long>();
	long i = 2;
	while (i <= number) {
	    if (number % i == 0) {
		list.add(i);
		number = number / i;
	    } else {
		i++;
	    }
	}
	return list;
    }
}