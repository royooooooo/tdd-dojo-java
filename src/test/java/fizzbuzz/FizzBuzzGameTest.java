package fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzGameTest {
    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "3, 'Fizz'",
            "5, 'Buzz'",
            "2, '2'",
            "15, 'FizzBuzz'",
            "13, 'Fizz'",
            "52, 'Buzz'",
            "53, 'FizzBuzz'",
    })
    void should_return_correct_value(int number, String expected) {
        assertThat(new FizzBuzz().calculate(number)).isEqualTo(expected);
    }
}
