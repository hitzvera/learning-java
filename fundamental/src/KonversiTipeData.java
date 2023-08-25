public class KonversiTipeData {
    public static void main(String[] args) {
        // koversi tipe data. jika tipe data dari yang lebih kecil ke yang lebih besar maka
        // akan dilakukan secara otomatis sebaliknya jika dari besar ke yang kecil harus manual

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // ini akan terjadi number overflow ketika sudah max akan kembali ke negative
    }
}
