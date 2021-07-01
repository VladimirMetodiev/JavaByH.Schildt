package chapter14.referenceOfConstructor;

public class MyClass {
    private String str;

    MyClass() { str = ""; }

    MyClass(String str) { this.str = str; }

    String getStr() { return str; }
}
