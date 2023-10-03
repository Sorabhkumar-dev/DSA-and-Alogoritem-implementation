import dynamic_array.DynamicArray;
import linkedlist.LinkedList;
import linkedlist.User;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(6);
        arr.add(2);
        arr.add(12);
        arr.add(22);
        System.out.println(arr);
        arr.delete(12);
        System.out.println(arr);
    }
}