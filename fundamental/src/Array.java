public class Array {
    public static void main(String[] args) {
        // kumpulan tipe data yang sama
        // jumlah array tidak bisa dirubah ketika pertama kali diinisialisasi

        // 1st method to declare an array
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Mujahid ";
        stringArray[1] = "Ansori ";
        stringArray[2] = "Majid ";

        System.out.println(stringArray[1]);

        int[] intArray = new int[]{
                10,10,10
        };

        long[] longArray = {10L, 10L};

        System.out.println(intArray.length);

        // 2 dimensions array

        String[][] members = {
                {"Mujahid", "Ansori"},
                {"Farhan", "Nurzaman"},
                {"Hilmy", "Apriadi"}

        };

        System.out.println(members[0][1]); // ansori

    }
}
