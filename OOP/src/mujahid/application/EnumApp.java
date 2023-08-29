package mujahid.application;

import mujahid.data.Customer;
import mujahid.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getLevel().getDescription());
        System.out.println();

        // enum to String
        String levelStandartName = Level.STANDARD.name();

        // string to level
        // harus hati hati ketika value ga ada akan menyebabkan error
        Level level = Level.valueOf("VIP");

        // print all enum available
        Level[] levels = Level.values();

        System.out.println(level);
        for(var item: levels){
            System.out.println(item);
        }
    }
}
