package chapter13.anotherQueue;

public class GenQueue<T> implements QueueOperations<T> {
    private T[] array;
    private int head;
    private int tail;

    public GenQueue(T[] array) {
        this.array = array;
        this.head = 0;
        this.tail = 0;
    }

    public void offer(T obj) throws QueueFullException {
        if(tail == array.length) throw new QueueFullException(array.length);
        array[tail++] = obj;
    }

    public T poll() throws QueueEmptyException {
        if(head == tail) throw new QueueEmptyException();
        if(head == 4 && array.length >= 5) shift();
        return array[head++];
    }

    public void peek() throws QueueEmptyException {
        if(head == tail) throw new QueueEmptyException();
        System.out.println(array[head]);
    }

    public void clear(){
        head = 0;
        tail = 0;
    }

    public void contains(T obj){
        boolean flag = false;
        for (int a = head; a < tail; a++) {
            if(array[a] == obj) {
                System.out.printf("The queue contains %s.%n", obj.toString());
                flag = true;
                break;
            }
        }
        if(!flag) System.out.printf("The queue doesn't contain %s.%n", obj.toString());
    }

    public int size() {
        if(head == 0 && tail == 0) return 0;
        else return tail - head;
    }

    public void print() throws QueueEmptyException {
        if(head == tail) throw new QueueEmptyException();
        for (int a = head; a < tail; a++) {
            if(a < tail - 1) System.out.print(array[a] + ", ");
            else System.out.println(array[a]);
        }
    }

    private void shift(){
        for (int a = head; a < tail; a++) {
            array[a - 4] = array[a];
        }
        head = 0;
        tail -= 4;
    }
}
