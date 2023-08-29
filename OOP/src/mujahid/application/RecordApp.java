package mujahid.application;

import mujahid.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Mujahid", "123");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Mujahid"));
    }
}
