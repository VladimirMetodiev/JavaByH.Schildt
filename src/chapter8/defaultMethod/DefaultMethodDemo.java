package chapter8.defaultMethod;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        GetID obj = new GetID();

        System.out.println("Administrator ID is: " + obj.getAdminID());
        System.out.println("User ID is: " + obj.getUserID());
    }
}
