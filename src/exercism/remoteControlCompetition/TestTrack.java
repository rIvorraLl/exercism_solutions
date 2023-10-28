package exercism.remoteControlCompetition;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {

    public static void race(RemoteControlCar car) {
	car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
	List<ProductionRemoteControlCar> sortedCars = cars.stream().sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
	return sortedCars;
    }
}
