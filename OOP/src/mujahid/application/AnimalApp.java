package mujahid.application;

import mujahid.data.Animal;
import mujahid.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Pussy";

        animal.run();
    }
}
