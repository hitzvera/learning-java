package classes;

import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {
        String name = "Mujahid Ansori Majid";// btw string is immutable
        String nameLowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(nameLowerCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Mujahid"));
        System.out.println(name.endsWith("Majid"));

        String[] names = name.split(" ");
        for(var item: names) {
            System.out.print(item + ",");
        }

        System.out.println(" ".isBlank()); // true
        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(name.charAt(0)); // M

        char[] charArray = name.toCharArray();

    }
}
