public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();

        child.name = "Mujahid";
        child.doIt();

        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt(); // tetep akan do it in child
        // karena ketika melakukan override terus mengcasting. akan mengikuti object casting berasalnya

        // berbeda dengan method jika variable maka akan mereference kepada "parent" nya
        // artinya field itu independet
        System.out.println(parent.name); // output null terjadi variable hiding
    }
}
