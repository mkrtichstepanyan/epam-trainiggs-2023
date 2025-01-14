package homework_9.Eduard_Eghiazaryan.annotations.procesors;

import homework_9.Eduard_Eghiazaryan.annotations.Adulthood;
import homework_9.Eduard_Eghiazaryan.error.Error;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationProcessor {
    public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
        Object o = field.get(customer);
        if (o instanceof LocalDate birthDate) {
            LocalDate now = LocalDate.now();
            int diff = Period.between(birthDate, now).getYears();
            Adulthood annotation = field.getAnnotation(Adulthood.class);
            if (diff < annotation.age()) {
                return new Error("The customer has not reached required age", field.getName());
            }
        }
        System.out.println("Validation is passed for " + field.getName());
        return null;
    }
}
