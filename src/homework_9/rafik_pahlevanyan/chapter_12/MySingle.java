package homework_9.rafik_pahlevanyan.chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();    //this variable name must be value
}
