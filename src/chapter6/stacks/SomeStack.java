package chapter6.stacks;

public abstract class SomeStack {
    private int head = 0;
    private int tail = 0;
    private int capacity = 0;
    private int size = 0;
    private boolean isItFull = false;

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isItFull() {
        return isItFull;
    }

    public void setItFull(boolean itFull) {
        isItFull = itFull;
    }

    public abstract void increasesTheSize();

    public abstract void getOldArray();

    public abstract void printSize();

    public abstract void print();

    public abstract void clear();
}
