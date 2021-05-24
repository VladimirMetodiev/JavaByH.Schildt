package chapter13.genericClassWithTwoParameters;

public class GenStart {
    public static void main(String[] args) {
        Gen<Integer, String> object = new Gen<>(19, "nineteen");

        object.setField1(9);
        object.setField2("nine");

        int intVal = object.getField1();
        String strVal = object.getField2();

        System.out.println("value: " + intVal);
        System.out.println("value: " + strVal + "\n");

        object.displayGen();
    }
}
