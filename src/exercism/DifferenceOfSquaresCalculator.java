package exercism;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
	int sum = input * (1 + input) / 2;
	return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
	int sum = input * (input + 1) * (2 * input + 1) / 6;
	return sum;
    }

    int computeDifferenceOfSquares(int input) {
	int squareOfSum = computeSquareOfSumTo(input);
	int sumOfSquares = computeSumOfSquaresTo(input);
	return squareOfSum - sumOfSquares;
    }
}
