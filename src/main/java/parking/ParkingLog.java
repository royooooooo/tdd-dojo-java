package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLog {
    private List<Car> cars;

    public ParkingLog() {
        cars = new ArrayList<>();
    }

    public void park(Car car) {
        cars.add(car);
    }

    public int getCarSize() {
        return cars.size();
    }

    public Car getCar() {
        return cars.get(0);
    }
}
