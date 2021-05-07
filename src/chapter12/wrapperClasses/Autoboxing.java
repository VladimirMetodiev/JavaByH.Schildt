package chapter12.wrapperClasses;

public class Autoboxing {
    static void executeTheMethod(Integer variable) {
        System.out.println("executeTheMethod() received: " + variable);
    }

    static int executeTheMethod2() {
        return 27;
    }

    static Integer executeTheMethod3() {
        return 81; // автоопакова 81 в обвиващ тип Integer.
    }

    public static void main(String[] args) {

        // Подавам на метода executeTheMethod() int стойност.
        // Тък като метода executeTheMethod() има Integer параметър, int стойноста се автоопакова
        executeTheMethod(199);

        // Обектът iObj получава int стойност, връщана от метода executeTheMethod2().
        // Стойността се автоопакова, за да бъде присвоена от обекта iObj на обвивящият тип Integer.
        Integer iObj = executeTheMethod2();
        System.out.println("Return value from executeTheMethod2() is: " + iObj);

        // Методът executeTheMethod3() връща Integer стойност, която се авторазопакова
        // за да бъде присвоена в променлива от тип int.
        int var = executeTheMethod3();
        System.out.println("Return value from executeTheMethod3() is: " + var);

        // Методът Math.sqrt() взима като аргумент обекта iObj, който се авторазопакова
        // и неговата стойност автоматично се преобразува в тип double, за да бъде извършено коренуване.
        iObj = 100;
        System.out.println("Square root of iOb is: " + Math.sqrt(iObj));
    }
}
