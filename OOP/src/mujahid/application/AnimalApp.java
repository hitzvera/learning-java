package mujahid.application;

import mujahid.annotation.Fancy;
import mujahid.data.Animal;
import mujahid.data.Cat;

@Fancy(tags = {"handsome", "strong"}, name = "Guguk")
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Pussy";

        animal.run();
    }
}
