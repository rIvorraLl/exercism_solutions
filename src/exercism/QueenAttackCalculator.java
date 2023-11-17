package exercism;

class QueenAttackCalculator {
    Queen queen1;
    Queen queen2;

    QueenAttackCalculator(Queen queen1, Queen queen2) {
	if (queen1 == null || queen2 == null) {
	    throw new IllegalArgumentException("You must supply valid positions for both Queens.");
	}
	if (queen1.row == queen2.row && queen1.column == queen2.column) {
	    throw new IllegalArgumentException("Queens cannot occupy the same position.");
	}
	this.queen1 = queen1;
	this.queen2 = queen2;
    }

    boolean canQueensAttackOneAnother() {
	if (queen1.row == queen2.row || queen1.column == queen2.column) {
	    return true;
	}
	int rowDiff = queen1.row - queen2.row;
	int columnDiff = queen1.column - queen2.column;
	if (Math.abs(rowDiff) == Math.abs(columnDiff)) {
	    return true;
	}
	return false;
    }
}