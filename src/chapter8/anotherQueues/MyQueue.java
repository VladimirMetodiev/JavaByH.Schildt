package chapter8.anotherQueues;

public interface MyQueue {
    public void offer(double number);
    public double poll();
    public double peek();
    public void clear();
    public int size();
    public String contains(double number);
    public void print();
}
