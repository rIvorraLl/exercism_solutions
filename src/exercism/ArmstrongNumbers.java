package exercism;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
	int initial = numberToCheck;
	int sum = 0;
	int len = String.valueOf(numberToCheck).length();
	while (numberToCheck % 10 > 0) {
	    sum += Math.pow(numberToCheck % 10, len);
	    numberToCheck = numberToCheck / 10;
	}
	return initial == sum;

    }
}