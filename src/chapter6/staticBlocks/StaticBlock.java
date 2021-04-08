package chapter6.staticBlocks;

public class StaticBlock {
    protected static double rootOf2;
    protected static double rootOf3;

    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(16.0);
        rootOf3 = Math.sqrt(81.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
