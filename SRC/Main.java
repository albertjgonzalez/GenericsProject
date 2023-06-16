public class Main {
    public static void main(String[] args) {
        Integer[] array = {2, 12, 22, 32};
        String[] strArray = {"albert", "code", "oop"};
        Character[] charArray = {'a', 'b', 'c'};

        System.out.println("22 is in index " + GenericMethods.findIndex(array, 22));
        System.out.println("'oop' is in index " + GenericMethods.findIndex(strArray, "oop"));
        System.out.println("'a' is in index " + GenericMethods.findIndex(charArray, 'a'));

        IntegerValueOne obj1 = new IntegerValueOne(1000);
        IntegerValueTwo obj2 = new IntegerValueTwo(999);

        IndexFinder result = GenericMethods.greaterThan(obj1, obj2);
        System.out.println("The greater value is: " + result.returnValue());
    }
}