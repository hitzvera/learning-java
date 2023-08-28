class Manager extends Employee {
    // String name // jika kita mendeklarasikan seperti ini maka akan terjadi variable hiding.
    String company;

    Manager(String name){
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " my name is Manager " + this.name);
    }
}
