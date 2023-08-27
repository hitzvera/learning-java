public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Mujahid");
        manager.name = "Mujahid";
        manager.sayHello("Budi");

        VicePresident vicePresident = new VicePresident("ansori");
        vicePresident.name = "ansori";
        vicePresident.sayHello("Budi");
    }
}
