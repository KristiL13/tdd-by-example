package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) { // now multiplication original amount doesn't change,
        // we return a new object of the calculation done on the original object
        // when it was:
        // void times (int multiplier) {
        //  amount *= multiplier;
        // }
        // then the object was mutable and this can often be a source of errors
        return new Dollar(amount * multiplier);
    }

}
