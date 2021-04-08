package chapter6.errors;

public class ErrorMessage {
    private String[] messages = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};

    public void getMessages(int index) {
        if(index >= 0 && index < messages.length) System.out.println(messages[index]);
        else System.out.println("Invalid Error Code");
    }
}
