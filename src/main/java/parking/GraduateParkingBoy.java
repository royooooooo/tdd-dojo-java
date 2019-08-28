package parking;

import java.util.List;

public class GraduateParkingBoy {
    private List<ParkingLog> parkingLogs;

    public GraduateParkingBoy(List<ParkingLog> parkingLogs) {
        this.parkingLogs = parkingLogs;
    }

    public void parking(Car car) {
        parkingLogs.get(0).park(car);
    }

    public Car takeTheCar() {
        return parkingLogs.get(0).getCar();
    }
}
