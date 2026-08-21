
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public boolean checkPayment(double payment, double expectedPayment) {
        if (payment >= expectedPayment) {
            return true;
        }
        return false;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.5;
        boolean correctPayment = this.checkPayment(payment, price);
        if (correctPayment == false) { return payment; }
        this.money += price;
        this.affordableMeals += 1;
        return payment - price;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.3;
        boolean correctPayment = this.checkPayment(payment, price);
        if (correctPayment == false) { return payment; }
        this. money += price;
        this.heartyMeals += 1;
        return payment - price;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.5;
        boolean correctPayment = this.checkPayment(card.balance(), price);
        if (correctPayment == true) {
            card.takeMoney(price);
            this.affordableMeals += 1;
        }
        return correctPayment;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.3;
        boolean correctPayment = this.checkPayment(card.balance(), price);
        if (correctPayment == true) {
            card.takeMoney(price);
            this.heartyMeals += 1;
        }
        return correctPayment;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
