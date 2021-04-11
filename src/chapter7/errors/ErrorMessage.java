package chapter7.errors;

public class ErrorMessage {
    final int OUT_ERROR = 0;
    final int IN_ERROR = 1;
    final int DISK_ERROR = 2;
    final int INDEX_ERROR = 3;

    String messages[] = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};

    String getErrorMessage(int i) {
        if(i >= 0 & i < messages.length) return messages[i];
        else return "Invalid Error Code";
    }
}
