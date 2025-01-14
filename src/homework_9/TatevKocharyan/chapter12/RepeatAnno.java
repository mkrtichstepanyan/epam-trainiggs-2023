package homework_9.TatevKocharyan.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno(str = "First annotation", val = -1)
    @MyAnno(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        Class<?> c = ob.getClass();
        try {
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno=m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not found.");

        }

    }

    public static void main(String[] args) {
        myMeth("test",10);
    }
}
