package homework_9.Nona_Asatryan.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
    MyAnno2[] value();
}
