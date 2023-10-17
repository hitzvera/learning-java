package hackerrank;

import java.util.Scanner;

public class Palindorm {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int n = A.length();
        String first, second;
        if(n % 2 == 1) {
            first = A.substring(0, (n/2)); // since exclusize need to add 1
            second = A.substring((n/2) + 1, n);
        } else {
            first = A.substring(0, (n/2));
            second = A.substring((n/2), n);
        }

        char c;
        String temp = "";
        for(int i=0;i<second.length();i++) {
            c = second.charAt(i);
            temp = c+temp;
        }
        second = temp;
        if(first.compareTo(second) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(first + " " + second);
    }
}
