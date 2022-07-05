import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BowlingTests {

    public static final int ALL_PINS_KNOCKED = 10;

    @Test
    public void zero_pins_were_knocked() {
        rollZeros(20);
        Assert.assertEquals(score(), 0);
    }

    @Test
    public void one_were_knocked() {
        roll(1);
        rollZeros(19);
        Assert.assertEquals(score(), 1);
    }

    @Test
    public void many_pins_knocked() {
        roll(4);
        roll(5);
        roll(5);
        roll(1);
        roll(9);
        rollZeros(15);
        Assert.assertEquals(score(), 24);
    }

    @Test
    public void one_spare() {
        roll(1);
        roll(9);
        roll(3);
        rollZeros(17);
        Assert.assertEquals(score(), 16);
    }

    @Test
    public void multiple_spares() {
        roll(1);
        roll(9);
        roll(3);
        roll(5);
        roll(5);
        roll(1);
        roll(8);
        roll(2);
        roll(3);
        roll(3);
        rollZeros(10);
        Assert.assertEquals(score(), 46);
    }

    @Test
    public void one_strike() {
        roll(10);
        roll(1);
        roll(1);
        rollZeros(16);

        Assert.assertEquals(score(), 14);
    }

    @Test
    public void two_strikes() {
        roll(0);
        roll(10);
        roll(10);
        roll(1);
        roll(1);
        rollZeros(14);

        Assert.assertEquals(score(), 34);
    }

    @Test
    public void multiple_strikes() {
        roll(10);
        roll(10);
        roll(10);
        roll(1);
        rollZeros(14);

        Assert.assertEquals(score(), 52);
    }

    private void rollZeros(int numberOfRolls) {
        for (int i = 0; i< numberOfRolls; i++) {
            roll(0);
        }
    }

    private int knockedPinsSum;
    private final ArrayList<Integer> rolls = new ArrayList<>();

    private void roll(int knockedPins) {
        rolls.add(knockedPins);
    }

    private int score() {
        List<Frame> frames = new ArrayList<>();

        for (int i = 0; i < rolls.size() - 1; i++) {
            Frame frame;
            if (rolls.get(i) == 10) {
                frame = new Frame(rolls.get(i), 0);
            } else {
                frame = new Frame(rolls.get(i), rolls.get(i + 1));
                i++;
            }
            frames.add(frame);
        }

        for (int i = 0; i < frames.size() - 1; i++) {
            Frame frame = frames.get(i);

            if (frame.getFirstRoll() == 10)
                knockedPinsSum += frames.get(i + 1).sumOfTwoRolls();

            if (frame.isSpare())
                knockedPinsSum += frames.get(i + 1).getFirstRoll();

            knockedPinsSum += frames.get(i).sumOfTwoRolls();

        }
        return knockedPinsSum;
    }

    class Frame {
        private final int firstRoll;
        private final int secondRoll;

        public Frame(int firstRoll, int secondRoll) {
            this.firstRoll = firstRoll;
            this.secondRoll = secondRoll;
        }

        public int getFirstRoll() {
            return firstRoll;
        }

        public int getSecondRoll() {
            return secondRoll;
        }

        public int sumOfTwoRolls() {
            return firstRoll + secondRoll;
        }

        private boolean isSpare() {
            return (firstRoll + secondRoll) == ALL_PINS_KNOCKED
                    && firstRoll < 10;
        }
    }
}