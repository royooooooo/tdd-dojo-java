package parking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParkingLotTest {
    @Test
    void should_take_the_car_and_park_the_car() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        parkingLot.park(car);
        assertThat(parkingLot.getCar()).isEqualTo(car);
    }
}
