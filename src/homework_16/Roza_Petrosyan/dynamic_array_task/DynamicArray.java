package homework_16.Roza_Petrosyan.dynamic_array_task;

public class DynamicArray {
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

    public void add(int index, int value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (size == array.length) {
            extend();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }

    public boolean addAll(int[] addedArray) {
        if(addedArray.length == 0) {
            return false;
        }
        for (int value : addedArray) {
            add(value);
        }
        return true;
    }
    public boolean addAll(int index, int[] addedArray) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if(addedArray.length == 0) {
            return false;
        }
        int numMoved = size - index;
        if (numMoved > 0) {
            System.arraycopy(array, index, array, index + addedArray.length, numMoved);
        }
        System.arraycopy(addedArray, 0, array, index, addedArray.length);
        size += addedArray.length;
        return true;
    }

    public void clear() {
        size = 0;
    }

    public int[] clone() {
        int[] newArray = new int[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public boolean contains(int value) {
        return indexOf(value) > -1;
    }

    public boolean containsAll(int[] innerArray) {
        for (int value : innerArray) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int index) {
        int removedElement = -1;
        int[] newArray = new int[array.length - 1];
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                removedElement = array[i];
                size -= 1;
            } else {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        return removedElement;
    }
    public boolean removeAll(int[] removalArray) {
        boolean result = false;
        for (int i = size - 1; i >= 0; i--) {
            for (int value : removalArray) {
                if (i < size){
                    if (array[i] == value) {
                        result = true;
                        remove(i);
                        i++;
                    }
                }
            }
        }
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public DynamicArray subList(int fromIndex, int toIndex) {
        if(fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        DynamicArray newArray = new DynamicArray();
        for (int i = 0; i < size; i++) {
            if (i >= fromIndex && i < toIndex) {
                newArray.add(array[i]);
            }
        }
        return newArray;
    }

    public int set(int index, int value) {
        int result = 0;
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                result = array[i];
                array[i] = value;
            }
        }
        return result;
    }

    public int[] sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public void trimToSize() {
        if(!isEmpty() && size < array.length) {
            int[] trimArray = new int[size];
            System.arraycopy(array, 0, trimArray, 0, trimArray.length);
            array = trimArray;
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        if(toIndex < size) {
            int[] newArray = new int[size - (toIndex - fromIndex)];
            for (int i = 0, k = 0; i < size; i++) {
                if (i < fromIndex || i >= toIndex) {
                    newArray[k] = array[i];
                    k++;
                }
            }
            array = newArray;
            size -= toIndex - fromIndex;
        }
    }

    public void replaceAll(String operator, int value) {
        for (int i = 0; i < size; i++) {
            switch (operator) {
                case "+" -> array[i] += value;
                case "-" -> array[i] -= value;
                case "/" -> array[i] /= value;
                case "%" -> array[i] %= value;
                case "*" -> array[i] *= value;
            }
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (array[i] == array[size - 1]) {
                sb.append(array[i]);
            } else {
                sb.append(array[i]).append(", ");
            }
        }
        return sb.append("]").toString();
    }

    private void extend() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
