public class Timer {
    ClockHand seconds;
    ClockHand hundredOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredOfSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundredOfSeconds.advance();
        if (this.hundredOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        String seconds = "" + this.seconds.value();
        String hundredOfSeconds = "" + this.hundredOfSeconds.value();

        if (this.seconds.value() < 10) {
            seconds = "0" + seconds;
        }

        if (this.hundredOfSeconds.value() < 10) {
            hundredOfSeconds = "0" + hundredOfSeconds;
        }
        return "" + seconds + ":" + hundredOfSeconds;
    }
}
