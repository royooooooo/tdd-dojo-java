package parking;

import java.util.List;

public class ParkingManager {
    private List<ParkingBoy> parkingBoys;
    public ParkingManager(List<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public void parkBySelf(Car car) {
        parkingBoys.get(0).parking(car);
    }

    public void parkByBoy(Car car) {
        parkingBoys.get(0).parking(car);
    }
}
