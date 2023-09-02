package hackerrank;

import java.util.Scanner;

public class SubstringComparasions {
    public static String getSmallestAndLargest(String s, int k) {
        String sub = s.substring(0, k);
        String smallest = sub;
        String largest = sub;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k
        for(int i=1;i<s.length()-(k-1);i++) {
           sub = s.substring(i, k+i);

           if(sub.compareTo(largest) > 0) {
               largest = sub;
           }
           if(sub.compareTo(smallest) < 0) {
               smallest = sub;
           }
        }

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();

        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
