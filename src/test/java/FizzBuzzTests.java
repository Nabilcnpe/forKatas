import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {

    @Test
    public void should_return_one_for_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        Assert.assertEquals(1, fizzBuzz.print(1));
    }
}
