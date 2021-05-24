package chapter13.anotherGen;

import java.util.Scanner;

public class Use {
    static void test(Gen<? extends A> o) {
        o.print();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> g = new Gen<A>(a);
        Gen<B> g2 = new Gen<B>(b);
        Gen<C> g3 = new Gen<C>(c);
        Gen<D> g4 = new Gen<D>(d);

        test(g);
        test(g2);
        test(g3);
//        test(g4); // Error!
    }
}
