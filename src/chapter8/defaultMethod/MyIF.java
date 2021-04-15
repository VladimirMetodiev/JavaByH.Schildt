package chapter8.defaultMethod;

public interface MyIF {
    int getUserID();

    default int getAdminID() {
        return 1;
    }
}
