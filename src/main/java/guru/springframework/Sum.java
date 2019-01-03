package guru.springframework;

public class Sum implements Expression {
    Expression augend;
    Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) { // will take 2 Money objects and reduce them to one object with sum operation
        int amount = augend.reduce(bank, toCurrency).amount + addend.reduce(bank, toCurrency).amount;
        return new Money(amount, toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }
}
