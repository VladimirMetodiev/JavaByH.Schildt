package chapter9.myException;

public class NonIntResultException extends Exception {
    int x;
    int y;

    NonIntResultException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("Result of %d / %d is non-integer.", x, y);
    }
}
