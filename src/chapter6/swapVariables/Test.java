package chapter6.swapVariables;

public class Test {
    protected int variable = 0;

    protected Test (int variable){
        this.variable = variable;
    }

    protected int getVariable() {
        return variable;
    }

    protected void setVariable(int variable) {
        this.variable = variable;
    }

    protected static void swap(Test obj1, Test obj2){
        int current = obj1.getVariable();
        obj1.setVariable(obj2.getVariable());
        obj2.setVariable(current);
    }

    protected static void printMessage(){
        System.out.println("Enter some integer:");
    }

    protected static void printObjectVariable(Test obj){
        System.out.println(obj.getVariable());
    }
}
