package homework_14.Roza_Petrosyan.chapter_14.generic_interfaces;

public class MyClass<T extends Comparable<T>> implements MinMax{
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }
    @Override
    public T min() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}
