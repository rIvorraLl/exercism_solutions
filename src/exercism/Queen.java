package exercism;

class Queen {
    int row;
    int column;

    Queen(int row, int column) {
	if (column >= 8) {
	    throw new IllegalArgumentException("Queen position must have column <= 7.");
	}
	if (row >= 8) {
	    throw new IllegalArgumentException("Queen position must have row <= 7.");
	}
	if (row < 0) {
	    throw new IllegalArgumentException("Queen position must have positive row.");
	}
	if (column < 0) {
	    throw new IllegalArgumentException("Queen position must have positive column.");
	}
	this.row = row;
	this.column = column;
    }
}
