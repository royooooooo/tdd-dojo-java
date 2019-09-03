package parking;

import java.util.List;

public class ParkingManager {
    private List<ParkingBoy> parkingBoys;
    private List<ParkingLot> parkingLots;

    public ParkingManager(List<ParkingBoy> parkingBoys, List<ParkingLot> parkingLots) {
        this.parkingBoys = parkingBoys;
        this.parkingLots = parkingLots;
    }

    public void parkBySelf(Car car) {
        parkingLots.get(0).park(car);
    }

    public void parkByBoy(Car car) {
        parkingBoys.get(0).parking(car);
    }
}
