package classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        // string itu imutable. jadi ketika membuat sebuah string tidak akan bisa diubah
        // contoh
        String name = "Mujahid";

        name = name + " Ansori";
        name = name + " Majid";

        // dalam contoh tersebut meskipun namenya mujahid ansori majid
        // namun di dalam memory akan ada 3
        // 1. Mujahid
        // 2. Mujahid Ansori
        // 3. Mujahid Ansori Majid

        // kalo String sering berubah maka pakenya string builder (non thread safe) tidak bisa dipake barengan
        // kalo StringBuffer (thread safe) bisa dipake barengan namun akan lebih lambat

        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append("Mujahid");
        sBuilder.append(" Ansori");
        sBuilder.append(" Majid");
        System.out.println(sBuilder); // nah ini akan hanya ada 1 di memory
    }
}
