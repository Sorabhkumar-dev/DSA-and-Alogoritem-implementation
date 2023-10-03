package dynamic_array;

import java.util.Arrays;

public class DynamicArray {
    private static final double loadFactor = 1.5;
    private int size = 0;
    private int arraySize;
    private int[] array;

    public DynamicArray(int size) {
        this.arraySize = size;
        array = new int[arraySize];
    }

    public int getSize() {
        return size;
    }

    public void add(int num) {
        if (size == arraySize) {
            increaseSize();
        }
        array[size++] = num;
    }

    private void increaseSize() {
        arraySize = (int) (arraySize * loadFactor);
        int[] newArray = new int[arraySize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void delete(int num) {
        for (int i = 0; i < size; i++) {
            if (num == array[i]) {
                swap(i, size);
                size--;
                decreaseSize();
                break;
            }
        }
    }

    public void swap(int start, int end) {
        for (int i = start; i < end - 1; i++) {
            array[i] = array[i + 1];
        }
        array[end - 1] = 0;
    }

    public void decreaseSize() {
        if (size <= arraySize / loadFactor) {
            arraySize = (int) (arraySize / loadFactor);
            int[] newArray = new int[arraySize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i : array) {
            str.append(i).append(", ");
        }
        if (size != 0)
            str.delete(str.length() - 2, str.length());
        str.append("]");
        return str.toString();
    }
}
