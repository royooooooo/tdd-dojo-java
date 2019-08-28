package parking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParkingLotTest {
    @Test
    void should_park_give_a_car() {
        ParkingLog parkingLog = new ParkingLog();
        parkingLog.park(new Car());
        assertThat(parkingLog.getCarSize()).isEqualTo(1);
    }

    @Test
    void should_take_the_car() {
        ParkingLog parkingLog = new ParkingLog();
        Car car = new Car();
        parkingLog.park(car);
        assertThat(parkingLog.getCar()).isEqualTo(car);
    }
}
