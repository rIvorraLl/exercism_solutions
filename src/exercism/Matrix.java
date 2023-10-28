package exercism;

class Matrix {
    String matrixAsString;

    Matrix(String matrixAsString) {
	this.matrixAsString = matrixAsString;
    }

    String[][] transformToMatrix(String matrixAString) {
	String[] splitString = matrixAsString.split("\n");
	int len = splitString[0].split(" ").length;
	String[][] matrix = new String[splitString.length][len];
	for (int i = 0; i < splitString.length; i++) {
	    String[] row = splitString[i].split(" ");
	    matrix[i] = row;
	}
	return matrix;
    }

    int[] getRow(int rowNumber) {
	rowNumber = rowNumber - 1;
	String[][] matrix = transformToMatrix(matrixAsString);
	int[] result = new int[matrix[0].length];
	for (int i = 0; i < matrix[rowNumber].length; i++) {
	    result[i] = Integer.parseInt(matrix[rowNumber][i]);
	}
	return result;
    }

    int[] getColumn(int columnNumber) {
	columnNumber = columnNumber - 1;
	String[][] matrix = transformToMatrix(matrixAsString);
	int[] result = new int[matrix.length];
	for (int i = 0; i < matrix.length; i++) {
	    result[i] = Integer.parseInt(matrix[i][columnNumber]);
	}
	return result;
    }
}
