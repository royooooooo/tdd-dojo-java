package parking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GraduateParkingBoyTest {

    @Test
    void should_pick_up_the_car_and_parking_car() {
        List<ParkingLog> parkingLogs = new ArrayList<>();
        parkingLogs.add(new ParkingLog());
        GraduateParkingBoy graduateParkingBoy = new GraduateParkingBoy(parkingLogs);
        Car car = new Car();
        graduateParkingBoy.parking(car);
        assertThat(graduateParkingBoy.takeTheCar()).isEqualTo(car);
    }
}
