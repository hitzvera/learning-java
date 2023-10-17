package hackerrank;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] lettersOnly = s.split("[ !,?._'@]");
        int counter = 0;
        for(String item: lettersOnly) {
            if(!item.isBlank() && !item.isEmpty()) {
                counter++;
            }
        }
        System.out.println(counter);
        for(String item: lettersOnly) {
            if(!item.isBlank() && !item.isEmpty()) {
                System.out.println(item);
            }
        }
        scan.close();
    }
}
