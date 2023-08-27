public class PolymorphismeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Mujahid");
        employee.sayHello("Budi");


        employee = new Manager("Mujahid");
        employee.sayHello("Budi");

        employee = new VicePresident("Mujahid");
        employee.sayHello("Budi");


        // salah satu bentuk polimorpisme
        sayHello(new Employee("ansori"));
        sayHello(new Manager("ansori"));
        sayHello(new VicePresident("ansori"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
