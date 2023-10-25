package exercism;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
	this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
	return birdsPerDay;
    }

    public int getToday() {
	return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
	birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
	for (int bird : birdsPerDay) {
	    if (bird == 0) {
		return true;
	    }
	}
	return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
	int result = 0;
	numberOfDays = numberOfDays <= birdsPerDay.length ? numberOfDays : birdsPerDay.length;
	for (int i = 0; i < numberOfDays; i++) {
	    result += birdsPerDay[i];
	}
	return result;
    }

    public int getBusyDays() {
	int result = 0;
	for (int bird : birdsPerDay) {
	    if (bird >= 5) {
		result++;
	    }
	}
	return result;
    }
}
