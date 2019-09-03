package parking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ParkingManagerTest {
    @Test
    void should_parking_car_by_parking_boy() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        List<ParkingBoy> parkingBoys = new ArrayList<>();
        parkingBoys.add(parkingBoy);
        ParkingManager parkingManager = new ParkingManager(parkingBoys, Collections.emptyList());
        parkingManager.parkBySelf(new Car());
        parkingManager.parkByBoy(new Car());
    }

    @Test
    void should_parking_car_by_self() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingManager parkingManager = new ParkingManager(Collections.emptyList(), parkingLots);
        parkingManager.parkBySelf(new Car());
    }
}
