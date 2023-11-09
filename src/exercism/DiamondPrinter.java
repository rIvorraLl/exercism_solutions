package exercism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
	ArrayList<String> diamond = new ArrayList<String>();
	String vowels = "ABCDEFGHIJKLMNOPQRSQUVWXYZ";
	String row = "";
	int vowelIndex = vowels.indexOf(a) + 1;
	int len = 2 * vowelIndex - 1;
	int l = len / 2;
	for (int i = 0; i < vowelIndex; i++) {
	    int r = len / 2 + 1;
	    boolean rDone = false;
	    for (int j = 0; j < len; j++) {
		if (j == l) {
		    row += "" + vowels.charAt(j);
		    l--;
		} else if (j != 0 && j == r && !rDone) {
		    row += "" + vowels.charAt(j);
		    r++;
		    rDone = true;
		} else {
		    row += ".";
		}
	    }
	    rDone = false;
	    diamond.add(row);
	    row = "";
	}
//        ····A····
//        ···B·B···
//        ··C···C··
//        ·D·····D·
//        E·······E
//        ·D·····D·
//        ··C···C··
//        ···B·B···
//        ····A····
	return diamond;
    }
    public static void main(String[] args) {
	DiamondPrinter dp = new DiamondPrinter();
	System.out.println(dp.printToList('E'));
    }
}