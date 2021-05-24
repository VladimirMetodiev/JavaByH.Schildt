package chapter13.compatibleTypes;

public class Start {
    public static void main(String[] args) {
        Pair<String, String> obj1 = new Pair<>("potato", "tomato");

        obj1.display();
        obj1.setField1("cucumber");
        System.out.printf("%s and %s%n%n", obj1.getField1(), obj1.getField2());


        Pair<Integer, Integer> obj2 = new Pair<>(6, 9);

        obj2.display();
        obj2.setField1(81);
        System.out.printf("%d and %d%n%n", obj2.getField1(), obj2.getField2());


        Pair<Number, Integer> obj3 = new Pair<>(27.0, 9);

        obj3.display();
        obj3.setField1(99.99);
        System.out.printf("%s and %s%n", obj3.getField1(), obj3.getField2());
    }
}
