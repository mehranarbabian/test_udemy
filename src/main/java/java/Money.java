package java;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;

    }

    protected String currency() {
        return currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    public boolean equals(Object object) {
        Money input = (Money) object;

        return amount == input.amount
                &&
                this.currency == input.currency;
    }

    @Override
    public Money reduce(Bank bank,String to) {
       return new Money(amount/bank.rate(this.currency,to),to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}