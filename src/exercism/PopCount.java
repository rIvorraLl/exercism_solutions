package exercism;

import java.util.ArrayList;
import java.util.List;

public class PopCount {
    public int eggCount(int number) {
	int result = 0;
	List<Integer> bitList = new ArrayList<Integer>();
	while (number / 2 > 0) {
	    bitList.add(number % 2);
	    number = number / 2;
	}
	bitList.add(number % 2);
	for (Integer n : bitList) {
	    if (n == 1) {
		result++;
	    }
	}
	return result;
    }
}
