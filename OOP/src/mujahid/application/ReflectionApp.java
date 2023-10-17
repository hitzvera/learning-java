package mujahid.application;

import mujahid.data.CreateUserRequest;
import mujahid.util.ValidationUtil;

import java.util.Calendar;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("mujahid");
        createUserRequest.setPassword("hit");

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2015);
        date.set(Calendar.MONTH, 05);
        date.set(Calendar.YEAR, 2015);

        ValidationUtil.validateReflector(createUserRequest);
    }
}
