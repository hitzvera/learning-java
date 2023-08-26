public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld("Mujahid");
        System.out.println(addTwoNumbers(2,3));

        // tanpa variable arguments
        int[] values = {80,80};
        sayCongrats("Mujahid", values);
        sayCongratsVarargs("Mujahid", 80, 80);

        System.out.println(fib(5));
    }
    static void sayHelloWorld(){
        System.out.println("hello world");
    }
    // method overloading
    static void sayHelloWorld(String name) {
        System.out.println("Hello " + name);
    }
    static int addTwoNumbers(int a, int b){
        return a + b;
    }
    // method variable arguments, jumlah argument yang tidak tentu
    // harus berada di akhir
    static void sayCongrats(String name, int[] values){
        int total = 0;
        for(var value: values){
            total += value;
        }

        int finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda lulus");
        } else {
            System.out.println("Mohon maaf anda tidak lulus");
        }
    }

    static void sayCongratsVarargs(String name, int... values){
        int total = 0;
        for(var value: values){
            total += value;
        }

        int finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda lulus");
        } else {
            System.out.println("Mohon maaf anda tidak lulus");
        }
    }

    // recursive method
    // note dalam recursive pemanggilan method itu terbatas sesuai memory di computer
    // jadi jika teralu dalam akan menyebabkan stackoverflow
    static int fib(int n) {
        if((n == 1) || (n == 2)){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    // komen untuk dokumentasi
    /**
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan dari value1 dan value2
     */
}
