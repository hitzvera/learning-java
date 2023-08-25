public class OperasiBoolean {
    public static void main(String[] args) {
        // operasi boolean sama terdapat tiga
        // dan dengan &&
        // atau dengan ||
        // NOT dengan !

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

    }
}
