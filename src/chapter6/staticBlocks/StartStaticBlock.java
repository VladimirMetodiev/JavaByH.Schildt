package chapter6.staticBlocks;

public class StartStaticBlock {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside Constructor.");

        System.out.println("Square root of 16 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 81 is " + StaticBlock.rootOf3);
    }
}
