public class IntegerValueTwo implements IndexFinder {
    private int value;

    public IntegerValueTwo(int value) {
        this.value = value;
    }

    @Override
    public int returnValue() {
        return this.value;
    }
}