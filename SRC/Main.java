public class Main {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 6, 8};
        String[] strArray = {"abc", "def", "ghi"};
        Character[] charArray = {'a', 'b', 'c'};

        System.out.println("Index of 6 in Integer array: " + GenericMethods.findIndex(array, 6));
        System.out.println("Index of 'ghi' in String array: " + GenericMethods.findIndex(strArray, "ghi"));
        System.out.println("Index of 'b' in Character array: " + GenericMethods.findIndex(charArray, 'b'));

        IntegerValueOne obj1 = new IntegerValueOne(5);
        IntegerValueTwo obj2 = new IntegerValueTwo(10);

        IndexFinder result = GenericMethods.greaterThan(obj1, obj2);
        System.out.println("Greater value is: " + result.returnValue());
    }
}