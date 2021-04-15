package chapter8.anotherQueues;

import java.util.ArrayList;

public class QueueRealization implements MyQueue {
    protected ArrayList<Double> queue = null;

    QueueRealization(){
        queue = new ArrayList<>();
    }

    @Override
    public void offer(double number) {
        queue.add(number);
    }

    @Override
    public double poll() {
        if(queue.size() > 0){
            double current = queue.get(0);
            queue.remove(0);
            return current;
        }
        else {
            return Double.NaN;
        }
    }

    @Override
    public double peek() {
        if(queue.size() > 0){
            return queue.get(0);
        }
        else {
            return Double.NaN;
        }
    }

    @Override
    public void clear(){
        queue.clear();
    }

    @Override
    public int size(){
        return queue.size();
    }

    @Override
    public String contains(double number){
        return queue.contains(number) ? "There is such number." : "There isn't such number.";
    }

    @Override
    public void print(){
        queue.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
