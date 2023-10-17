package classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        joiner.add("Mujahid");
        joiner.add("Ansori");
        joiner.add("Majid");

        String value = joiner.toString();
        System.out.println(value);
    }
}
