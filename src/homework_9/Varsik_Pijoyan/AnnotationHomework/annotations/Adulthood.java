package homework_9.Varsik_Pijoyan.AnnotationHomework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Adulthood {
    String message() default "You must be under the age of majority";
    int age() default 18;
}
