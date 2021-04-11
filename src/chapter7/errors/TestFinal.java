package chapter7.errors;

public class TestFinal {
    public static void main(String args[]) {
        ErrorMessage err = new ErrorMessage();

        System.out.println(err.getErrorMessage(err.OUT_ERROR));
        System.out.println(err.getErrorMessage(err.IN_ERROR));
        System.out.println(err.getErrorMessage(err.DISK_ERROR));
        System.out.println(err.getErrorMessage(err.INDEX_ERROR));
        System.out.println(err.getErrorMessage(88));
    }
}
