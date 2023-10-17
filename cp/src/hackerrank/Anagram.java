package hackerrank;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String a, String b) {
        final int CHARACTER_RANGE = 128; // edge of ascii code
        int count[] = new int[CHARACTER_RANGE];

        if(a.length() != b.length()) {
            return false;
        }
        for(int i=0;i<a.length();i++) {
            count[a.toLowerCase().charAt(i)]++;
            count[b.toLowerCase().charAt(i)]--;
        }
        for(int i=0;i<CHARACTER_RANGE;i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
