package chapter8.numberSeries;

import java.util.ArrayList;

public class NumericalSeries implements Series {
    private int start = 0;
    private int value = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    public NumericalSeries() {
    }

    public NumericalSeries(int start, int value) {
        this.start = start;
        this.value = value;
        list.add(start);
        getMessage();
    }

    @Override
    public int getLast() {
        return list.get(list.size() - 1);
    }

    @Override
    public void add(){
        list.add(list.get(list.size() - 1) + value);
        System.out.printf("The number %d was added.%n", list.get(list.size() - 1));
    }

    @Override
    public void remove(){
        if(list.size() > 1) {
            list.remove(list.size() - 1);
            System.out.println("The last number was removed.");
        }
        else{
            System.out.println("The start number can not be removed.");
        }
    }

    @Override
    public void reset() {
        start = 0;
        value = 0;
        list.clear();
        System.out.println("You reset number sequence.");
    }

    @Override
    public void setStart(int num, int val) {
        this.start = num;
        this.value = val;
        list.add(start);
        getMessage();
    }

    @Override
    public void print(){
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private void getMessage(){
        System.out.println("You start a number sequence.");
    }
}
