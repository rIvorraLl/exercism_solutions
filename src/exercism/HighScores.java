package exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    List<Integer> HighScores = new ArrayList<Integer>();

    public HighScores(List<Integer> highScores) {
	this.HighScores = highScores;
    }

    List<Integer> scores() {
	return HighScores;
    }

    Integer latest() {
	return HighScores.get(HighScores.size() - 1);
    }

    Integer personalBest() {
	Integer best = -1;
	for (int score : HighScores) {
	    if (score > best) {
		best = score;
	    }
	}
	return best;
    }

    List<Integer> personalTopThree() {
	List<Integer> copyOfHighScores = new ArrayList<Integer>();
	for (Integer num : HighScores) {
	    copyOfHighScores.add(num);
	}
	Collections.sort(copyOfHighScores);
	if (copyOfHighScores.size() >= 3) {
	    copyOfHighScores = copyOfHighScores.subList(copyOfHighScores.size() - 3, copyOfHighScores.size());
	}
	Collections.sort(copyOfHighScores, Collections.reverseOrder());
	return copyOfHighScores;
    }
}
