package chapter7.methodOverriding;

public class SubClass extends Superclass {
    private int var3 = 0;

    public SubClass(int var1, int var2, int var3) {
        super(var1, var2);
        this.var3 = var3;
    }

    @Override
    void displayFields(){
        System.out.println("The field of SubClass is: " + var3);
        System.out.println("The fields of Superclass are: " + getVar1() + " and " + getVar2());
    }

    /*
    @Override
    void displayFields(){
        super.displayFields();
        System.out.println("Field 3 is: " + var3);
    }
    */
}
