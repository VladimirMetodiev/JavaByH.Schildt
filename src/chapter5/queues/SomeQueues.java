package chapter5.queues;

public class SomeQueues {
    private int head = 0;
    private int tail = 0;
    private int newLength = 0;
    private boolean isItFull = false;
    private int[] queue = new int[16];
    private int[] current = null;

    public SomeQueues() {
    }

    public SomeQueues(SomeQueues obj) {
        this.queue = new int[obj.queue.length];
        this.head = obj.head;
        this.tail = obj.tail;

        for (int a = 0; a < tail; a++) {
            this.queue[a] = obj.queue[a];
        }
    }

    public void offer(int element){
        if(tail == queue.length - 1){
            increasesTheSize();
        }

        if(!isItFull){
            queue[tail] = element;
            ++tail;
        }
    }

    public int poll(){
        int element = queue[head];
        ++head;
        return element;
    }

    public void increasesTheSize(){
        getOldArray();

        if(queue.length * 2 <= Integer.MAX_VALUE) {
            newLength = queue.length * 2;
        }
        else{
            if(queue.length < Integer.MAX_VALUE) {
                newLength = Integer.MAX_VALUE;
            }
            else {
                isItFull = true;
                System.out.println("The maximal capacity of Queue was reached");
            }
        }

        queue = new int[newLength];

        for (int a = 0; a < current.length; a++) {
            queue[a] = current[a];
        }

        head = 0;
        tail = current.length - 1;
    }

    public void getOldArray(){
        current = new int[tail - head];

        for (int a = 0; a < current.length; a++) {
            current[a] = queue[a + head];
        }
    }

    public boolean isThereElement(){
        return head <= tail - 1;
    }

    public void print(){
        for (int a = head; a < tail; a++) {
            if(a < tail - 1)System.out.print(queue[a] + ", ");
            else System.out.println(queue[a]);
        }
    }
}
