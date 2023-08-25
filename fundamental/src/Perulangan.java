public class Perulangan {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        var nilai = 50;
        boolean masihRemed = nilai >= 70 ? false:true;
        while(masihRemed){
            System.out.println("remedke");
            nilai+=5;
            masihRemed = nilai >= 70 ? false:true;
        }

        do{
            System.out.println("akan dijalankan meskipun kondisi tidka terpenuhi");
        } while(masihRemed);

        String[] nama = {
                "Mujahid", "ansori", "majid"
        };

        for (var name: nama
        ) {
            System.out.println(name);
        }
    }
}
