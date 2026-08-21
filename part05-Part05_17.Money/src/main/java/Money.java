
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public Money minus(Money subtraction) {
        int thisAmount = this.euros * 100 + this.cents;
        int subtractionAmount = subtraction.euros * 100 + subtraction.cents;

        int subtractedAmount = thisAmount - subtractionAmount;
        if (subtractedAmount < 0) {
            subtractedAmount = 0;
        }
        Money newMoney = new Money(subtractedAmount / 100, subtractedAmount % 100);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int thisAmount = this.euros * 100 + this.cents;
        int comparedAmount = compared.euros * 100 + compared.cents;
        if (thisAmount < comparedAmount) {
            return true;
        }

        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
