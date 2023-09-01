package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalinJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] s = new String[n];

        for(int i = 0;i<s.length;i++) {
            s[i] = scanner.next();
        }

        BigDecimal A, B;

        for(int i=0;i<s.length;i++) {
            for(int j=i+1;j<s.length;j++) {
                A = new BigDecimal(s[i]);
                B = new BigDecimal(s[j]);

                if(A.compareTo(B) == -1) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }

        BigDecimal a = new BigDecimal(".2");
        BigDecimal b = new BigDecimal("0.2");

        System.out.println(a.compareTo(b));
    }
}
