package homework_9.Eduard_Eghiazaryan.chaper_12.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method is not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
