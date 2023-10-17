package classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Mujahid Ansori Majid";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");
        // perbedaan antara String tokenizer sama split
        // kalo split itu eager load jadi langsung semua
        // tapi kalo tokenizer itu lazy

        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
