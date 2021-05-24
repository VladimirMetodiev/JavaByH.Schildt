package chapter13.extendsNumber;

public class NumericalFunctions<T extends Number, V extends Number> {
    T number1;
    V number2;

    public NumericalFunctions() {
    }

    NumericalFunctions(T number1, V number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    void setNumber1(T number1) {
        this.number1 = number1;
    }

    void setNumber2(V number2) {
        this.number2 = number2;
    }

    void add(){
        System.out.println(number1.doubleValue() + number2.doubleValue());
    }

    void subtract(){
        System.out.println(number1.doubleValue() - number2.doubleValue());
    }

    void multiply(){
        System.out.println(number1.doubleValue() * number2.doubleValue());
    }

    void divide(){
        try {
            System.out.println(number1.doubleValue() / number2.doubleValue());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
