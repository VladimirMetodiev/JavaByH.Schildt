package chapter13.genericInterface;

public class NewClass<T> {
    T[] arrayRef;

    NewClass(T[] o) {
        arrayRef = o;
    }

    public boolean contains(T o) {
        for(T x : arrayRef) if(x.equals(o)) return true;
        return false;
    }
}
