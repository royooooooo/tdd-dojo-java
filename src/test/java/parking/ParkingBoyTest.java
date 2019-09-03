package parking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ParkingBoyTest {

    @Test
    void should_pick_up_the_car_and_parking_car() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        ParkingBoy graduateParkingBoy = new ParkingBoy(parkingLots);
        Car car = new Car();
        graduateParkingBoy.parking(car);
        assertThat(graduateParkingBoy.takeTheCar()).isEqualTo(car);
    }
}
