package chapter6.reliableArray;

public class FailSoftArray {
    private int[] array = null;
    private int length = 0;

    public FailSoftArray(int length) {
        this.array = new int[length];
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    void putNumber(int index, int value){
        array[index] = value;
    }

    void getNumber(int index){
        System.out.println(array[index]);
    }

    void printArray(){
        for(int a = 0; a < length; a++){
            if(a < length - 1) System.out.print(array[a] + ", ");
            else System.out.println(array[a] + ";");
        }
    }

    static boolean checkLength(int length){
        if(length > 0 && length <= 1000000) return true;
        else return false;
    }

    static boolean checkIndex(int index, int length){
        if(index >= 0 && index < length) return true;
        else return false;
    }

    static boolean checkNumber(long number){
        if(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) return true;
        else return false;
    }
}
