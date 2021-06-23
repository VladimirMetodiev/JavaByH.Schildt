package chapter13.anotherQueue;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return String.format("Queue is full. Maximum size is %d.", size);
    }
}
