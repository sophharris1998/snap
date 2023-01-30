public class Card {
    public String suit;
    public String symbol;
    public int value;

    @Override
    public String toString() {
        return suit + symbol;
    }

    public int getValue () {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
