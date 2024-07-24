package homework_16.Davit_Poghosyan;

public class DynamicArray {
    /* Please create methods below
       addAll() -> adds all elements of a collection to arraylist
       clear() -> removes all the elements from arraylist
       clone() -> makes a copy of the array list
       contains() -> checks if the element is present in the arraylist
       containsAll() -> checks if a collection is a subset of arraylist
       indexOf() -> returns the position of the specified element
       remove() -> removes the single element from the arraylist
       removeAll() -> removes multiple elements from the arraylist
       isEmpty() -> checks if the arraylist is empty
       subList() -> returns a portion of the arraylist
       set() -> replace the single element from an arraylist
       sort() -> sorts the arraylist according to specified order -> use one of our previous algorithms (bubble, insertion ...)
       toString() -> converts the arraylist into a String
       trimToSize() -> trims the capacity of arraylist equal to the size
       removeRange() -> removes a portion of the arraylist
       replaceAll() -> replace all elements from the arraylist
     */

    private int[] array;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;


    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        } else {
            throw new IllegalArgumentException("Array length must be bigger than 0");
        }
    }

    public DynamicArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void addAll(int[] array) {
        for (int i = 0; i < array.length; i++) {
            add(array[i]);
        }

    }

    public void clear() {
        size = 0;
        array = new int[DEFAULT_CAPACITY];
    }

    public DynamicArray clone() {
        DynamicArray clone = new DynamicArray(this.array.length);
        for (int i = 0; i < size; i++) {
            clone.add(this.array.length);
        }
        return clone;
    }

    public boolean contains(int item) {
        for (int i : array) {
            if (i == item) {
                return true;
            }

        }
        return false;
    }

    public boolean containsAll(int[] items) {
        for (int i : array) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int item) {
        int indexOfItem = indexOf(item);
        if (indexOfItem == -1) {
            return;
        }
        for (int i = indexOfItem; i < size - 1; i++) {
            array[indexOfItem] = array[indexOfItem + 1];
        }
        size--;
    }

    public void removeAll(int[] items) {
        for (int i : array) {
            remove(i);
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public DynamicArray subList(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        DynamicArray subArray = new DynamicArray(endIndex - startIndex);
        for (int i = startIndex; i < endIndex; i++) {
            subArray.add(array[i]);
        }
        return subArray;
    }

    public void set(int item, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = item;
    }

    public int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            return array;
        }
        return null;
    }

    public String toString(int[] array) {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < array.length; i++) {
            string.append(array[i]);
            string.append(",");
        }
        string.append("]");
        return string.toString();
    }

    public void trimToSize() {
        if (size < array.length) {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void removeRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = startIndex; i < endIndex; i++) {
            remove(array[i]);
        }
    }

    public void replaceAll(int[] replaceArray) {
        for (int i = 0; i < array.length; i++) {
            array[i] = replaceArray[i];
        }
    }

}
