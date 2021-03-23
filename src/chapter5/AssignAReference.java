package chapter5;

public class AssignAReference {
    public static void main(String[] args) {
        int[] theFirst = new int[10];
        int[] theSecond = new int[10];

        for (int i = 0; i < 10; i++) {
            theFirst[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            theSecond[i] = -i;
        }

        System.out.print("Here is the first array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(theFirst[i] + " ");
        }
        System.out.println();

        System.out.print("Here is the second array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(theSecond[i] + " ");
        }
        System.out.println();

        theSecond = theFirst;

        System.out.print("Here is the second array after assignment: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(theSecond[i] + " ");
        }
        System.out.println();


        theSecond[3] = 333;
        theSecond[6] = 666;

        System.out.print("Here is the first array after change through the second array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(theFirst[i] + " ");
        }

    }
}
