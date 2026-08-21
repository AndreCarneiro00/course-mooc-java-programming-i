public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int contains() {
        return value;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        int newAmount = value + amount;
        if (newAmount > 100) {
            newAmount = 100;
        }

        this.value = newAmount;
    }

    public void remove(int amount) {
            if (amount < 0) {
                return;
            }

            int newAmount = value - amount;
            if (newAmount < 0) {
                newAmount = 0;
            }

            this.value = newAmount;

    }

    public void move(int amount, Container second) {
        if (amount <= 0) {
            return;
        }

        if (value == 0) {
            return;
        }

        int newFirst = value - amount;
        int newSecond = second.contains() + amount;
        if (amount > value) {
            newSecond += newFirst;
            newFirst = 0;
        }
        if (newFirst < 0) {
            newFirst = 0;
        }
        if (newSecond > 100) {
            newSecond = 100;
        }
        this.value = newFirst;
        second.setValue(newSecond);
    }

    @Override
    public String toString() {
        return value + "/100";
    }
}
