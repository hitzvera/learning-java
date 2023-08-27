
// constructor sebuah method yang akan dipanggil ketika object pertama kali dibuat
// ketika membuat object dengan class yang memiliki constructor maka harus semuanya dipenuhi

// constructor juga bisa melakukan overloading, yang artinya banyak constructor dengan parameter yang berbeda

class Person {
    String name;
    String address;
    final String country = "Indonesia"; // tidak bisa dirubah

    Person(String name, String address){
        // name = name; variable shadowing
        // makanya menggunakan this untuk nge refer attribute si object bukan si parameter

        this.name = name;
        this.address = address;
    }

    Person(String name) {
//        this.name = name;
//        this.address = "the address has not been initialize";
        // memanggil constructor lain
        this(name, "the address has not been initialize");
    }

    Person(){
//        this.name = "Name has not been initialize";
//        this.address = "address has not been initialize";
        this("name has not been initialize");
    }

    void sayHello(String paramName){
        System.out.println("Hello, " + paramName + " My name is " + name);
    }
}
