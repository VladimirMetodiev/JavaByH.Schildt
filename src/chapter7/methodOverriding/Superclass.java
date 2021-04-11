package chapter7.methodOverriding;

public class Superclass {
    private int var1 = 0;
    private int var2 = 0;

    Superclass(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    void displayFields(){
        System.out.println("Field 1 is: " + var1);
        System.out.println("Field 2 is: " + var2);
    }
}
