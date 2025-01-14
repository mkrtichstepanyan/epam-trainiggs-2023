package homework_9.Nelli_Poghosyan.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface Min {
    int value() default 0;
    String message() default "Discount rate can't be less than 0";
}
