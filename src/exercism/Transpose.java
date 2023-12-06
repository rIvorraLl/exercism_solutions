package exercism;

public class Transpose {
    public String transpose(String toTranspose) {
	String result = "";
	String slice = "";
	String[] splitted = toTranspose.split("\n");
	int longerLen = longerStringLen(splitted);
	for (int i = 0; i < longerLen; i++) {
	    for (int j = 0; j < splitted.length; j++) {
		if (i + 1 > splitted[j].length()) {
		    slice += " ";
		} else {
		    slice += splitted[j].charAt(i);
		}
	    }
	    // result += slice.replaceAll("\\s+$", "") + "\n";
	    result += slice + "\n";
	    slice = "";
	}
	return result.trim();
    }

    public int longerStringLen(String[] strArr) {
	int longer = 0;
	for (String str : strArr) {
	    if (str.length() > longer) {
		longer = str.length();
	    }
	}
	return longer;
    }

    public static void main(String[] args) {
	Transpose tr = new Transpose();
	System.out.println(tr.transpose(
		"The longest line.\\n\" + \"A long line.\\n\" + \"A longer line.\\n\" + \"A line.")
		+ " ->result");
    }
}
