package homework_16.Davit_Poghosyan.GenericDynamicArray;

public class GenericDynamicArray <T>{


        private T[] array;

        private int size = 0;

        private static final int DEFAULT_CAPACITY = 16;


        public GenericDynamicArray(int capacity) {
            if (capacity > 0) {
                this.array = (T[]) new Object[capacity];
            } else {
                throw new IllegalArgumentException("Array length must be bigger than 0");
            }
        }

        public GenericDynamicArray() {
            this.array = (T[])new Object[DEFAULT_CAPACITY];
        }

        public int getSize() {
            return size;
        }

        public void add(T value) {
            if (size == array.length) {
                extend();
            }
            array[size++] = value;
        }

        public T get(int index) {
            if (index < 0 || index > size - 1) {
                throw new ArrayIndexOutOfBoundsException("Wrong index");
            }
            return array[index];
        }

        private void extend() {
            T[] newArray = (T[])new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        public void addAll(T[] array) {
            for (int i = 0; i < array.length; i++) {
                add(array[i]);
            }

        }

        public void clear() {
            size = 0;
            array = (T[])new Object[DEFAULT_CAPACITY];
        }

        public GenericDynamicArray clone() {
            GenericDynamicArray clone = new GenericDynamicArray(this.array.length);
            for (int i = 0; i < size; i++) {
                clone.add(this.array.length);
            }
            return clone;
        }

        public boolean contains(T item) {
            for (T i : array) {
                if (i.equals(item)) {
                    return true;
                }

            }
            return false;
        }

        public boolean containsAll(T[] items) {
            for (T i : array) {
                if (contains(i)) {
                    return true;
                }
            }
            return false;
        }

        public int indexOf(T item) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(item)) {
                    return i;
                }
            }
            return -1;
        }

        public void remove(T item) {
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
            for (T i : array) {
                remove(i);
            }
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        public GenericDynamicArray subList(int startIndex, int endIndex) {
            if (startIndex < 0 || endIndex > size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            GenericDynamicArray subArray = new GenericDynamicArray(endIndex - startIndex);
            for (int i = startIndex; i < endIndex; i++) {
                subArray.add(array[i]);
            }
            return subArray;
        }

        public void set(T item, int index) {
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
                T[] newArray = (T[])new Object[size];
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

        public void replaceAll(T[] replaceArray) {
            for (int i = 0; i < array.length; i++) {
                array[i] = replaceArray[i];
            }
        }

    }


