package chapter6.stacks;

public class IntegerStack extends SomeStack {
    private int[] stack = null;
    private int[] current = null;

    public IntegerStack(int capacity) {
        setCapacity(capacity);
        this.stack = new int[getCapacity()];
        System.out.println("You create a number stack.");
    }

    public void push(int element){
        if(getTail() == stack.length - 1){
            increasesTheSize();
        }

        if(!isItFull()){
            stack[getTail()] = element;
            setTail(getTail() + 1);
            setSize(getSize() + 1);
        }
    }

    public int pop(){
        if(getTail() - 1 >= 0) {
            int element = stack[getTail() - 1];
            setTail(getTail() - 1);
            setSize(getSize() - 1);
            return element;
        }
        else return -1;
    }

    public int peek(){
        if(getTail() - 1 >= 0) {
            return stack[getTail() - 1];
        }
        else return -1;
    }

    @Override
    public void increasesTheSize(){
        getOldArray();

        if(stack.length * 2 <= Integer.MAX_VALUE) {
            setCapacity(stack.length * 2);
        }
        else{
            if(stack.length < Integer.MAX_VALUE) {
                setCapacity(Integer.MAX_VALUE);
            }
            else {
                setItFull(true);
                System.out.println("The maximal capacity of Stack was reached.");
            }
        }

        stack = new int[getCapacity()];

        for (int a = 0; a < current.length; a++) {
            stack[a] = current[a];
        }

        setHead(0);
        setTail(current.length);
    }

    @Override
    public void getOldArray(){
        current = new int[getTail() - getHead()];

        for (int a = 0; a < current.length; a++) {
            current[a] = stack[a + getHead()];
        }
    }

    @Override
    public void printSize(){
        System.out.printf("The size of stack is: %d%n", getSize());
    }

    @Override
    public void print(){
        int counter = 0;

        for (int a = 0; a < getSize(); a++) {
            counter++;
            if(a < getSize() - 1) {
                if(counter == 10) {
                    System.out.println(stack[a]);
                    counter = 0;
                    continue;
                }
                System.out.print(stack[a] + ", ");
            }
            else{
                System.out.println(stack[a]);
            }
        }
    }

    @Override
    public void clear(){
        setSize(0);
        setTail(0);
        setCapacity(8);
        stack = new int[getCapacity()];
    }
}
