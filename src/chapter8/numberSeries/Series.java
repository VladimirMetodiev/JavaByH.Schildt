package chapter8.numberSeries;

public interface Series {
    public int getLast ();
    public void add ();
    public void remove ();
    public void reset ();
    public void print ();
    public void setStart(int num, int val);
}
