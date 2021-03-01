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
// Променлива може да се обяви, в който и да било блок-код.
// Областта на действие на дадена променлива е в блока с код, в който е създадена, от мястото на създаването ѝ,
// до затварящата фигуративна скоба на блока с код.

// В Java има три вида променливи: локални променливи, параметри на методи и член-променливи на класове.

// Инициализация - първото присвояване на стойност на променлива

// Литерал - значението на променлива от определен тип (данни), зададено в сорс кода на компютърна програма
// В Java шеснайсетичният литерал се указва с 0х или 0Х пред числото
// В Java бинарният литерал се указва с 0b или 0B пред числото

// Понякога се налага да работим със символи, които не са изписани на
// клавиатурата или със символи, които имат специално значение, като
// например символът "нов ред". Те не могат да се изпишат директно в сорс
// кода на програмата и за да ги укажем, ползваме Escaping последователности.
// Всяка от тях започва с обратно-наклонената черта "\" - наричана "екраниращ символ.

//Escaping последователности

// \' – единична кавичка
// \" – двойна кавичка
// \\ – обратно-наклонена черта
// \n – нов ред
// \f - нова страница
// \b - връщане с една позиция
// \t – отместване (табулация)

