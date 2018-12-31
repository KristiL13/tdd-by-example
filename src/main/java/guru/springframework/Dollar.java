package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) { // now multiplication original amount doesn't change,
        // we return a new object of the calculation done on the original object
        // when it was:
        // void times (int multiplier) {
        //  amount *= multiplier;
        // }
        // then the object was mutable and this can often be a source of errors
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
