package chapter14.referenceForAnInstanceMethod;

public class MyIntNum {
    private int value;

    MyIntNum(int value){
        this.value = value;
    }

    int getValue() { return this.value; }

    boolean isFactor(int num) {
        return (this.value % num) == 0;
    }
}
