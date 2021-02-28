package chapter1;

public class DeclaringVariables {
    public static void main(String[] args){
        System.out.println("Declaring variables");      // Деклариране на променлива - задава се типът и името на променливата
        byte digit;
        short shortNumber;
        int number;
        long longNumber;
        float floatNumber;
        double realNumber;
        boolean isItTrue;
        char letter;
        String expression;
        Object object;

        System.out.println("Value assignment");         // Присвояване на стойност
        digit = 127;
        shortNumber = 32767;
        number = 2147483647;
        longNumber = 9223372036854775807L;
        floatNumber = 3.1415927F;
        realNumber = 3.14159265358979;
        isItTrue = false;
        letter = 'A';
        expression = "java programming";
        object = new Object();

        System.out.println("Print variables");
        System.out.println(digit);
        System.out.println(shortNumber);
        System.out.println(number);
        System.out.println(longNumber);
        System.out.println(floatNumber);
        System.out.println(realNumber);
        System.out.println(isItTrue);
        System.out.println(letter);
        System.out.println(expression);
        System.out.println(object);
    }
}



// "=" знак за присвояване

// "==" знак за равенство

// Променлива (variable) - област от паметта, която съдържа в себе си някаква стойност,
// която може да бъде променяна, по време на изпълнението на програмата.
// Всяка променлива има тип, идентификатор (име) и значение.

// Инициализация - първото присвояване на стойност на променлива

// Литерал - значението на променлива от определен тип (данни), зададено в сорс кода на компютърна програма
