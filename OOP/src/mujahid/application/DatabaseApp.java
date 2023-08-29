package mujahid.application;

import mujahid.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Mujahid", null);
        System.out.println("Sukses");
    }

    static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}
