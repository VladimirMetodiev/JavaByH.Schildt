package chapter1;

import java.util.Scanner;

public class BlockCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double result;

        if(b != 0){
            result = a / b;
            System.out.println(result);
        }
    }
}



//Променлива (variable) - област от паметта, която съдържа в себе си някаква стойност,
//която може да бъде променяна, по време на изпълнението на програмата.
//Всяка променлива има тип, идентификатор (име) и значение.

//Блок код - това е сорс кода между отварящите и затварящите фигуративни скоби.

//В Java точката и запетаята - ";" служи като разделител за инструкциите (т.е всяка инструкция завършва с ";".

