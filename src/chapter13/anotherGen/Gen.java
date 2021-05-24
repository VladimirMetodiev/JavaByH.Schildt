package chapter13.anotherGen;

public class Gen<T> {
    T variable;

    Gen(T variable) {
        this.variable = variable;
    }

    void print(){
        System.out.println(variable.getClass().getName());
    }
}
