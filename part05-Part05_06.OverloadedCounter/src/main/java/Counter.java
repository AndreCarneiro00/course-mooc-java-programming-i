public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void increase(int value) {
        if (value < 0) {
            return;
        }
        this.value += value;
    }

    public void decrease() {
        this.value -= 1;
    }

    public void decrease(int value) {
        if (value < 0) {
            return;
        }
        this.value -= value;
    }
}
