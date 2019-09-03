package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars;

    public ParkingLot() {
        cars = new ArrayList<>();
    }

    public void park(Car car) {
        cars.add(car);
    }

    public Car getCar() {
        return cars.get(0);
    }
}
