package exercism.remoteControlCompetition;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int distance;
    Integer numberOfVictories;

    public void drive() {
	distance += 10;
    }

    public int getDistanceTravelled() {
	return distance;
    }

    public int getNumberOfVictories() {
	return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
	this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar prc) {
	return this.numberOfVictories.compareTo(prc.numberOfVictories);
    }
}
