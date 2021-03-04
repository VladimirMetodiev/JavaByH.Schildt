package chapter3;

public class IfElseIfElse {
    public static void main(String[] args) {
        int x;

        for (x = 1; x <= 5; x++) {
            if (x == 1) {
                System.out.println("x is one");
            }
            else if (x == 2) {
                System.out.println("x is two");
            }
            else if (x == 3) {
                System.out.println("x is three");
            }
            else if (x == 4) {
                System.out.println("x is four");
            }
            else {
                System.out.println("x is five");        // else е условие по подразбиране (ако останалите не се изпълнят)
            }
        }
    }
}


// Принцепна схема

// if(условие){
//   блок с код;
// }
// else if (условие)
//   блок с код;
// }
// else{
//   блок с код;
// }
