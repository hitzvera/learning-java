package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Throwable;

public class ThrowableInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
