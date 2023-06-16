public class IntegerValueOne implements IndexFinder {
    private int value;

    public IntegerValueOne(int value) {
        this.value = value;
    }

    @Override
    public int returnValue() {
        return this.value;
    }
}