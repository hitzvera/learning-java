public class Wgs {
    public static void main(String[] args) {
        // soal pertama
        // memasukan berapa banyak baris
        // karena dicontoh statik 5 baris jadi kita tidak perlu menggunakan Scanner
        System.out.println("1. Soal pertama");
        int n = 5;

        // perulangan untuk baris
        for(int i=1;i<=5;i++) {
            // perulangan untuk print value bintang
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // membuat baris baru jika perulangan j selesai.
            System.out.println();
        }

        System.out.println();

        System.out.println("2. Soal kedua");
        // soal ketiga
        for(int i=0;i<6;i++) {
            for(int j=6-i;j<=6;j++){
                System.out.print("*");
            }
            for(int j=6-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=6-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=6-i;j<=6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<6;i++) {
            for(int j=i;j<6;j++){
                System.out.print("*");
            }
            for(int j=6-i;j<=6;j++){
                System.out.print(" ");
            }
            for(int j=6-i;j<=6;j++){
                System.out.print(" ");
            }
            for(int j=i;j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
