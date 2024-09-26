package homework_19.Roza_Petrosyan.chapter_15.method_references_with_generics;

public class MyArrayOps {
    static <T> int countMatching(T[] vars, T v) {
        int count = 0;
        for (int i = 0; i < vars.length; i++) {
            if(vars[i] == v) count++;
        }
        return count;
    }
}
