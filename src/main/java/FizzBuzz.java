
public class FizzBuzz {
    public String calculate(int number) {
        String result = "";
        if (isAliquot(number, 3) || isContains(number, "3")) result += "Fizz";
        if (isAliquot(number, 5) || isContains(number, "5")) result += "Buzz";
        if (result.isEmpty()) result += number;
        return result;
    }

    private boolean isContains(int number, String s) {
        return String.valueOf(number).contains(s);
    }

    private boolean isAliquot(int number, int divisor) {
        return number % divisor == 0;
    }
}
