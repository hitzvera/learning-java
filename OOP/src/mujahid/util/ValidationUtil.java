package mujahid.util;

import mujahid.data.LoginRequest;
import mujahid.error.BlankException;
import mujahid.error.ValidationException;

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
}
