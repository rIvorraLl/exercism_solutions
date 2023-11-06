package exercism;

class CryptoSquare {
    String plaintext = new String();

    CryptoSquare(String plaintext) {
	String provStr = plaintext.replaceAll("\\W", "").toLowerCase();
	String result = new String();
	int column = (int) Math.sqrt(provStr.length());
	int row = (int) Math.sqrt(provStr.length());
	boolean check = column * row >= provStr.length() && column >= row && column - row <= 1;
	while (!check) {
	    column++;
	    check = column * row >= provStr.length() && column >= row && column - row <= 1;
	    if (check) {
		break;
	    } else {
		row++;
		check = column * row >= provStr.length() && column >= row && column - row <= 1;

	    }
	}
	int padding = column * row - provStr.length();
	for (int i = 0; i < padding; i++) {
	    provStr += " ";
	}
	for (int i = 0; i < column; i++) {
	    for (int j = i; j < column * row; j += column) {
		result += "" + provStr.charAt(j);
	    }
	    if (i != column - 1) {
		result += " ";
	    }
	}
	this.plaintext = result;
    }

    String getCiphertext() {
	return plaintext;
    }
}
