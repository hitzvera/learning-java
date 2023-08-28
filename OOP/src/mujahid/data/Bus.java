package mujahid.data;

public class Bus implements Car{
    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Mercedez benz";
    }

    @Override
    public boolean isBig() {
        return true;
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public void drive() {
        System.out.println("driving a bus right here");
    }
}
