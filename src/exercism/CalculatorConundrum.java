package exercism;

class CalculatorConundrum {
    String result = "";

    public String calculate(int operand1, int operand2, String operation) {
	if (operation == null) {
	    throw new IllegalArgumentException("Operation cannot be null");
	}
	if (operation.equals("")) {
	    throw new IllegalArgumentException("Operation cannot be empty");
	}
	if (operation.equals("")) {
	    throw new IllegalArgumentException("Operation cannot be empty");
	}
	if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
	    // Uncomment following line to run - throws error in Eclipse IDE.
	    // throw new IllegalOperationException("Operation '" + operation + "' does not
	    // exist");
	}
	switch (operation) {
	case "+":
	    int sum = operand1 + operand2;
	    result = "" + operand1 + " + " + operand2 + " = " + sum;
	    break;
	case "*":
	    int mult = operand1 * operand2;
	    result = "" + operand1 + " * " + operand2 + " = " + mult;
	    break;
	case "/":
	    try {
		int div = operand1 / operand2;
	    } catch (ArithmeticException e) {
		// Uncomment following line to run - throws error in Eclipse IDE.
		// throw new IllegalOperationException("Division by zero is not allowed", e);
	    }
	    result = "" + operand1 + " / " + operand2 + " = " + operand1 / operand2;
	    break;
	}
	return result;
    }
}
