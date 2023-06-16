public class GenericMethods {

    public static <T> int findIndex(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends IndexFinder> T greaterThan(T obj1, T obj2) {
        return obj1.returnValue() > obj2.returnValue() ? obj1 : obj2;
    }
}