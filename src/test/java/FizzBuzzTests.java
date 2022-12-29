import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {

    @Test
    public void should_return_one_for_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        Assert.assertEquals("1", fizzBuzz.print(number));
    }

    @Test
    public void should_return_two_for_two() {
        FizzBuzz fizzBuzz = new FizzBuzz();
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
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        Assert.assertEquals("FIZZ", fizzBuzz.print(number));
    }
    @Test
    public void should_return_FIZZ_for_six() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;
        Assert.assertEquals("FIZZ", fizzBuzz.print(number));
    }

    @Test
    public void should_return_FIZZ_for_nine() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        Assert.assertEquals("FIZZ", fizzBuzz.print(number));
    }

}
