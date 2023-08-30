package mujahid.application;

import mujahid.data.CreateUserRequest;
import mujahid.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("mujahid");
        createUserRequest.setPassword("hit");

        ValidationUtil.validateReflector(createUserRequest);
    }
}
