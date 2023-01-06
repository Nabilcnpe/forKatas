import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_one_for_one() {
        int number = 1;
        Assert.assertEquals("1", fizzBuzz.print(number));
    }

    @Test
    public void should_return_two_for_two() {
        int number = 2;
        Assert.assertEquals("2", fizzBuzz.print(number));
    }

    @Test
    public void should_return_four_for_four() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 4;
        Assert.assertEquals("4", fizzBuzz.print(number));
    }

    @Test
    public void should_return_FIZZ_for_three() {
        int number = 3;
        Assert.assertEquals("FIZZ", fizzBuzz.print(number));
    }
    @Test
    public void should_return_FIZZ_for_six() {
        int number = 6;
        Assert.assertEquals("FIZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_FIZZ_for_nine() {
        int number = 9;
        Assert.assertEquals("FIZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_BUZZ_for_five() {
        int number = 5;
        Assert.assertEquals("BUZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_BUZZ_for_ten() {
        int number = 10;
        Assert.assertEquals("BUZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_BUZZ_for_twenty() {
        int number = 20;
        Assert.assertEquals("BUZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_FIZZBUZZ_for_fifteen() {
        int number = 15;
        Assert.assertEquals("FIZZBUZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_FIZZBUZZ_for_thirty() {
        int number = 30;
        Assert.assertEquals("FIZZBUZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_FIZZBUZZ_for_forty_five() {
        int number = 45;
        Assert.assertEquals("FIZZBUZZ", fizzBuzz.print(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 8, 15, Integer.MAX_VALUE / 15})
    public void test_return_FIZZBUZZ_for_multi_value(int testNumber) {
        int number = 15 * testNumber;
        Assert.assertEquals("FIZZBUZZ", fizzBuzz.print(number));
    }
}
