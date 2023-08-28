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
        if(employee instanceof VicePresident) {
            // bisa langsung casting juga
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello vp " + vicePresident.name);
        } else if(employee instanceof Manager) {
            System.out.println("Hello Manager " + employee.name);
        } else {
            System.out.println("hello employee " + employee.name);
        }
    }
}
