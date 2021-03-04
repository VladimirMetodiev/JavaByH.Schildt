package chapter3;

public class ContinueToLabel {
    public static void main(String[] args) {
        outerLoop:
        for (int a = 1; a <= 5; a++) {
            System.out.printf("%nOuter loop pass %d, Inner loop: ", a);

            for (int b = 1; b < 10; b++) {
                if (b == 6) continue outerLoop;
                System.out.print(b + " ");
            }
        }
    }
}



// Инструкцията continue осъществява принудително преминаване към следващата стъпка,
// докато инструкцията break, прекратява изпълнението на цикъла.