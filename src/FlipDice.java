public class FlipDice {
    private static final int minimumValueOfDice = 1;
    private static final int maximumValueOfDice = 6;

    public int flipDice() {
        return (int) (Math.random() * maximumValueOfDice) + minimumValueOfDice;
    }
}
