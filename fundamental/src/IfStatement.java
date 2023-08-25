public class IfStatement {
    public static void main(String[] args) {
        var absen = 70;
        var ujianAkhir = 75;

        if(absen >= 75 && ujianAkhir >= 75){
            System.out.println("Selamat Anda lulus");
        }

        char nilai = 'A';
        switch(nilai){
            case 'A':
                System.out.println("lulus dengan sangat baik");
                break;
            case 'B':
                System.out.println("lulus dengan sangat baik");
                break;
            case 'C':
                System.out.println("lulus dengan sangat baik");
                break;
            case 'D':
                System.out.println("lulus dengan sangat baik");
                break;
            case 'E':
                System.out.println("lulus dengan sangat baik");
                break;
            default:
                System.out.println("jelek banget ku");

        }
        // dimulai pada java 14 kita dapat menggunakan lambda dalam swith case
        switch (nilai){
            case 'A' ->System.out.println("bagus banget gila");
            case 'B', 'C' -> System.out.println("gila sih");
            default -> {System.out.println("jelek");}
        }

        // menggunakan yeild
        String ucapan = switch (nilai) {
            case 'A':
                yield "Bagus banget gila";
            case 'B', 'C':
                yield "mayanlah";
            default:
                yield "jelek banget gila";
        };

        System.out.println(ucapan);

        // ternary operator
        String ucapan2 = nilai >= 75 ? "bagus sekali":"Lumayan";
        System.out.println(ucapan2);
    }
}
