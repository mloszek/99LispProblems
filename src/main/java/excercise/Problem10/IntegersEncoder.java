package excercise.Problem10;

/**
 * Creating objects with either amount of a number and number itself
 */
public class IntegersEncoder {

    Integer amount;

    String character;

    public String getCharacter() {
        return character;
    }

    public Integer getAmount() {
        return amount;
    }

    public IntegersEncoder(Integer amount, String character) {
        this.amount = amount;
        this.character = character;
    }

    @Override
    public String toString() {
        return "[" + amount.toString() + " " + character + "]";
    }
}
