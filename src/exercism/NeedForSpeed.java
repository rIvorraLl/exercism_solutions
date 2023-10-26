package exercism;

class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
	this.speed = speed;
	this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
	return battery <= 0;
    }

    public int distanceDriven() {
	return distance;
    }

    public void drive() {
	if (!batteryDrained()) {
	    distance += speed;
	    battery -= batteryDrain;
	}
    }

    public static NeedForSpeed nitro() {
	NeedForSpeed car = new NeedForSpeed(50, 4);
	return car;
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
	this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
	RaceTrack rt = new RaceTrack(distance);
	int speed = car.speed;
	for (int i = distance; i >= 0; i -= speed) {
	    car.drive();
	    if (car.batteryDrained() && car.distanceDriven() < rt.distance) {
		return false;
	    }
	}
	return true;
    }
}
