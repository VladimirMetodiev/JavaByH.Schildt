package chapter6.stacks;

public class StringStack extends SomeStack{
    private String[] stack = null;
    private String[] current = null;

    public StringStack(int capacity) {
        setCapacity(capacity);
        this.stack = new String[getCapacity()];
        System.out.println("You create a text stack.");
    }

    public void push(String element){
        if(getTail() == stack.length - 1){
            increasesTheSize();
        }

        if(!isItFull()){
            stack[getTail()] = element;
            setTail(getTail() + 1);
            setSize(getSize() + 1);
        }
    }

    public String pop(){
        if(getTail() - 1 >= 0) {
            String element = stack[getTail() - 1];
            setTail(getTail() - 1);
            setSize(getSize() - 1);
            return element;
        }
        else return "" + (-1);
    }

    public String peek(){
        if(getTail() - 1 >= 0) {
            return stack[getTail() - 1];
        }
        else return "" + (-1);
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

        stack = new String[getCapacity()];

        for (int a = 0; a < current.length; a++) {
            stack[a] = current[a];
        }

        setHead(0);
        setTail(current.length );
    }

    @Override
    public void getOldArray(){
        current = new String[getTail() - getHead()];

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
        for (int a = 0; a < getSize(); a++) {
            System.out.println(stack[a]);
        }
    }

    @Override
    public void clear(){
        setSize(0);
        setTail(0);
        setCapacity(8);
        stack = new String[getCapacity()];
    }
}
