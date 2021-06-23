package chapter13.anotherQueue;

public interface QueueOperations<T> {
    public void offer(T o) throws QueueFullException;
    public T poll() throws QueueEmptyException;
    public void peek() throws QueueEmptyException;
    public void clear();
    public void contains(T o);
    public int size();
    public void print() throws QueueEmptyException;
}
