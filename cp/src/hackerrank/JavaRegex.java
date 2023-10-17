package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    public boolean isPatternValid(String patternParams) {
        Pattern pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(patternParams);
        boolean matchFound = matcher.find();
        if(matchFound) {
            return true;
        } else {
            return false;
        }
    }
}

public class JavaRegex {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            System.out.println(new MyRegex().isPatternValid(sc.nextLine()));
        }
        sc.close();
    }
}
