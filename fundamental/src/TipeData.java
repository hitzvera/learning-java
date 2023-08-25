public class TipeData {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000;
        long intLong = 1000000;
        long intLong2 = 10000000L;

        float iniFloat = 10.5F;
        double iniDouble = 10.5;

        // kode literal
        int decimalInt = 10;
        int hexInt = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // for readibiilty
        int satuJuta = 1_000_000;

        char firstWord = 'a'; // harus dengan single tik

        System.out.println(firstWord);

        boolean iniBool = false;
        String iniString = "Mujahid Ansori "; // default value
        String iniString2 = "Majid";
        String fullname = iniString + iniString2;
        System.out.println(iniString + iniString2);
        System.out.println(fullname);

        // late initialize
        String name;
        name = "Mujahid ansori majid";

        // berbeda menggunakan var, harus diinitialize
        var name2 = "Mujahid ANsori majid";

        // final (tidak bisa berubah)
        final int cobaUbahAngka = 5;
        // cobaUbahAngka = 7; akan error




    }
}
