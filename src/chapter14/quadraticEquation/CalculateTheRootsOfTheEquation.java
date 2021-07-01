package chapter14.quadraticEquation;

import java.util.Scanner;

public class CalculateTheRootsOfTheEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter \"a\": ");
        double a = Double.parseDouble(input.nextLine());
        System.out.print("Enter \"b\": ");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Enter \"c\": ");
        double c = Double.parseDouble(input.nextLine());

        double discriminant = Mathematics.calculate(Mathematics::calculateDiscriminant, a, b, c);

        if(discriminant < 0) {
            System.out.println("The quadratic equation doesn't have roots.");
        }
        else if(discriminant == 0){
            System.out.println("The quadratic equation has one root:" );
            System.out.println("x = " + Mathematics.calculate(Mathematics::calculateX, a, b, c));
        }
        else{
            System.out.println("The quadratic equation has two roots:" );
            double x1 = Mathematics.calculate(Mathematics::calculateX1, a, b, c);
            double x2 = Mathematics.calculate(Mathematics::calculateX2, a, b, c);
            System.out.println("x1 = " + x1 + " and x2 = " + x2);
        }
    }
}



//Квадратно уравнение
// a * x ^ 2 + b * x + c = 0



//Tests

//Input
//1
//4
//-5

//Output
//The quadratic equation has two roots:
//x1 = 1.0 and x2 = -5.0


//Input
//1
//3
//-4

//Output
//The quadratic equation has two roots:
//x1 = 1.0 and x2 = -4.0


//Input
//-2
//1
//3

//Output
//The quadratic equation has two roots:
//x1 = -1.0 and x2 = 1.5


//Input
//3
//4
//5

//Output
//The quadratic equation doesn't have roots.


//Input
//1
//0
//-4

//Output
//The quadratic equation has two roots:
//x1 = 2.0 and x2 = -2.0


//Input
//1
//4
//4

//Output
//The quadratic equation has one root:
//x = -2.0
