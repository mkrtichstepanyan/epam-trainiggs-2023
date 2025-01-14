package homework_9.Nelli_Poghosyan.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface AdultHood {
    int age() default 18;
    String message() default "The customer should be an adult";
}
