package chapter2;

public class PrimeNumbersFrom2To100 {
    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++) {
            boolean flag = true;
            // числото a дали се дели на някое от числата от 2 до а / 2
            for (int b = 2; b <= a / 2; b++) {
                if(a % b == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) System.out.print(a + " ");
        }
    }
}



//Condition

//Принтирайте всички прости числа от 2 до 100
//Просто число е всяко естествено число, по-голямо от 1, което дели единствено на 1 и на самото себе си
//Ако имам числото Х, то мога да проверя дали се дели на стойностите от 2 до X / 2




