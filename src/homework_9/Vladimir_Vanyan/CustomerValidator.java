package homework_9.Vladimir_Vanyan;

import homework_9.Vladimir_Vanyan.annotations.*;
import homework_9.Vladimir_Vanyan.annotations.procesors.*;
import homework_9.Vladimir_Vanyan.error.Errors;

import java.lang.reflect.Field;

// utility classes - does not contain state
public class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Max.class)) {
                errors.addError(MaxAnnotationProcessor.processAnnotation(obj, field));
            }
            if (field.isAnnotationPresent(Min.class)) {
                errors.addError(MinAnnotationProcessor.processAnnotation(obj, field));
            }
        }
        return errors;
    }
}
