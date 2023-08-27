public class PersonApp {

    // jika ada field yang belum dideklarasikan maka defaultnya akan null

    public static void main(String[] args) {
        Person person1 = new Person("Mujahid", "Sindanglaya");
        Person person2 = new Person();
        Person person3 = new Person("Hilman");

        System.out.println(person1); // lokasi unique id di memory

        person1.name = "Mujahid"; // menginisialisasi field dalam object yang ada di class
        person1.address = "sindang laya";
        // person1.country = "malaysai"; akan error karena final

        System.out.println(person1.name);
        person1.sayHello("Budi"); // memanggil method di dalam class

        System.out.println(person2.name);
    }
}
