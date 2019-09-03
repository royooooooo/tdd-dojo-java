package parking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ParkingManagerTest {
    @Test
    void should_manage_parking_boy() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        List<ParkingBoy> parkingBoys = new ArrayList<>();
        parkingBoys.add(parkingBoy);
        ParkingManager parkingManager = new ParkingManager(parkingBoys);
        parkingManager.parkBySelf(new Car());
        parkingManager.parkByBoy(new Car());

    }
}
