package exercism;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
	double result = speed * 221.0;
	if (speed <= 4) {
	    return result;
	} else if (speed <= 8) {
	    return result * 0.9;
	} else if (speed <= 9) {
	    return result * 0.8;
	}
	return result * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
	double itemsPerHour = productionRatePerHour(speed);
	return (int) itemsPerHour / 60;
    }
}
