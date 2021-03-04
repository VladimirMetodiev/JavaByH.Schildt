package chapter3;

public class BreakExampleFour {
    public static void main(String[] args) {
        for (int index = 1; index < 4; index++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\nindex is: " + index);
                        if (index == 1) break one;
                        if (index == 2) break two;
                        if (index == 3) break three;

                        System.out.println("Won't print.");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
    }
}


// За да присвоя име на блок, трябва да поставя маркер (етикет) пред него.
// Маркера представлява идентификатор с двуеточие
// Маркера може да се използва с break, само ако се намира в блока, койно е именуван !!!

