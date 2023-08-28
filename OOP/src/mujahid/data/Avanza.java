package mujahid.data;

public class Avanza implements Car{
    public void drive() {
        System.out.println("Avanza is driving");
    }

     public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
