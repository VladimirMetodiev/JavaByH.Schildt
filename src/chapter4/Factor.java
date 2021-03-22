package chapter4;

import java.util.Scanner;

public class Factor {
    private double x = 0d;
    private double y = 0d;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Factor f = new Factor();

        f.x = input.nextDouble();
        f.y = input.nextDouble();

        if(f.isFactor(f.x, f.y)) System.out.println("It is factor.");
        else System.out.println("It isn't factor.");
    }

    boolean isFactor(double x, double y){
        if(x % y == 0) return true;
        else return false;
    }
}
