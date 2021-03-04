package chapter3;

public class BreakExampleFive {
    public static void main(String[] args) {
        done:
        for (int z = 0; z < 10; z++) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 10; x++) {
                    System.out.println(x + " ");
                    if (x == 5) break done;         // jump to done
                }
                System.out.println("After x loop");
            }
            System.out.println("After y loop");
        }
        System.out.println("After z loop");
    }
}

