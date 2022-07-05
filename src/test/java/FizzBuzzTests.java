import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTests {

    @Test
    public void shouldReturnOneIfNumberIsOne() {
        assertEquals("1", fizzBuzz(1));
    }

    @Test
    public void shouldReturnTwoIfNumberIsTwo() {
        assertEquals("2", fizzBuzz(2));
    }

    @Test
    public void shouldReturnFizzIfNumberIsThree() {
        assertEquals("Fizz", fizzBuzz(3));
    }

    @Test
    public void shouldReturnFizzIfNumberIsMultipleOfThree() {
        assertEquals("Fizz", fizzBuzz(6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsFive() {
        assertEquals("Buzz", fizzBuzz(5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsMultipleOfFive() {
        assertEquals("Buzz", fizzBuzz(10));
    }

    @Test
    public void shouldReturnFiZZBuzzIfNumberIsFifteen() {
        assertEquals("FizzBuzz", fizzBuzz(15));
    }

    @Test
    public void shouldReturnFiZZBuzzIfNumberIsThirty() {
        assertEquals("FizzBuzz", fizzBuzz(30));
    }

    private String fizzBuzz(int number) {
        if (number % 15 == 0)
            return "FizzBuzz";
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }
}
