package mujahid.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Mujahid";
        String second = "Mujahid";

        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true
    }
}
