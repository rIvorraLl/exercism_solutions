package exercism;

class Darts {
    int score(double xOfDart, double yOfDart) {
	int points = 0;
	double distance = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
	if (distance > 10) {
	    return points;
	}
	if (distance > 5) {
	    return 1;
	}
	if (distance > 1) {
	    return 5;
	}
	return 10;
    }
}
