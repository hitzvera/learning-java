package hackerrank;

import java.util.Scanner;

public class Lexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder a = new StringBuilder(scanner.next());
        StringBuilder b = new StringBuilder(scanner.next());

        boolean isLexicographically = false;
        System.out.println(a.length() + b.length());
        for(int i=0;i<Math.min(a.length(), b.length()); i++) {
            int intA = charToAscii(a.charAt(i));
            int intB = charToAscii(b.charAt(i));
            if(charToAscii(a.charAt(i)) == charToAscii(b.charAt(i))) {
                continue;
            } else if(charToAscii(a.charAt(i)) > charToAscii(b.charAt(i))) {
                isLexicographically = true;
            }
            break;

        }

        if(isLexicographically) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        a.setCharAt(0, Character.toUpperCase(a.charAt(0)));
        b.setCharAt(0, Character.toUpperCase(b.charAt(0)));

        System.out.println(a + " " + b);
    }

    public static int charToAscii(char c) {
        return c;
    }
}
