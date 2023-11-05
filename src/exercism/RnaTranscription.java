package exercism;

class RnaTranscription {

    String transcribe(String dnaStrand) {
	String result = new String();
	for (int i = 0; i < dnaStrand.length(); i++) {
	    switch (dnaStrand.charAt(i)) {
	    case 'G':
		result += "C";
		break;
	    case 'C':
		result += 'G';
		break;
	    case 'T':
		result += 'A';
		break;
	    case 'A':
		result += 'U';
		break;
	    }
	}
	return result;
    }
}
