package mujahid.util;

import mujahid.annotation.NotBlank;
import mujahid.data.LoginRequest;
import mujahid.error.BlankException;
import mujahid.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username() == null) throw new NullPointerException("Username cant be null");
        else if(loginRequest.username().isBlank()) throw new ValidationException("Username cant be empty");
        else if(loginRequest.password() == null) throw new NullPointerException("password cant be null");
        else if(loginRequest.password().isBlank()) throw new ValidationException("password cant be empty");
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null) throw new NullPointerException("Username cant be null");
        else if(loginRequest.username().isBlank()) throw new BlankException("Username cant be empty");
        else if(loginRequest.password() == null) throw new NullPointerException("password cant be null");
        else if(loginRequest.password().isBlank()) throw new BlankException("password cant be empty");
    }

    public static void validateReflector(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(Field field: fields) {
            field.setAccessible(true); // untuk membuat private fields terbaca

            if(field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is Blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Field " + field.getName() + " can't be accessed");
                }
            }
        }
    }
}
