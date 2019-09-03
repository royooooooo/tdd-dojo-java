package parking;

import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void parking(Car car) {
        parkingLots.get(0).park(car);
    }

    public Car takeTheCar() {
        return parkingLots.get(0).getCar();
    }
}
