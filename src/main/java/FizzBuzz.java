public class FizzBuzz {
    public String print(int number) {
        if (number % 15 == 0)
            return "FIZZBUZZ";
        if (number % 5 == 0)
            return "BUZZ";
        if (number % 3 == 0)
            return "FIZZ";
        return Integer.toString(number);
    }
}
