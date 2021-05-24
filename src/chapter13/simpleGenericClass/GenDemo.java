package chapter13.simpleGenericClass;

public class GenDemo {
    public static void main(String args[]) {
        Gen<Integer> intObj;

        intObj = new Gen<Integer>(19);

        intObj.showType();

        int variable = intObj.getObj();
        System.out.printf("Value: %d%n%n", variable);


        Gen<String> strOb = new Gen<String>("Another Generics");

        strOb.showType();

        String str = strOb.getObj();
        System.out.println("Value: " + str);
    }
}
