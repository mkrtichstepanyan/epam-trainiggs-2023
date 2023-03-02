package homework_9.Diana_Melkonyann.annotations.procesors;

import homework_9.Diana_Melkonyann.annotations.Email;
import homework_9.Diana_Melkonyann.error.Error;

import java.lang.reflect.Field;
import java.util.regex.Pattern;
public class EmailAnnotationProcessor {

        public static Error processAnnotation(Object customer, Field field) throws IllegalAccessException {
            Object o = field.get(customer);
            // pattern matching
            if (o instanceof String email) {

                if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\" +
                        ".[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")){
                    return new Error("The invalid email", field.getName());
                }
            } else {
                return new Error("Wrong usage error", field.getName());
            }
            return null;
        }
    }

