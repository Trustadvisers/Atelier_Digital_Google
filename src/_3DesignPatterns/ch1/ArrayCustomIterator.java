package _3DesignPatterns.ch1;

public class ArrayCustomIterator {
    private int currentPosition;
    private int[] arr;

    public ArrayCustomIterator(int [] arr){
        this.arr = arr;
        this.currentPosition = -1;
    }

    public boolean hasNext(){
        if (currentPosition< arr.length-1){
            return true;
        } return false;
    }

    public int next(){
        currentPosition++;
        return arr[currentPosition];
    }
}
