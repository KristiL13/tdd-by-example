package guru.springframework;

public class Sum implements Expression {
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String toCurrency) { // will take 2 Money objects and reduce them to one object with sum operation
        int amount = augend.amount + addend.amount;
        return new Money(amount, toCurrency);
    }
}
