package hackerrank;

import java.text.*;
import java.io.*;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(n);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(n);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(n);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(n);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);




    }
}
