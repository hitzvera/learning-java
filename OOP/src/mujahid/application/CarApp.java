package mujahid.application;

import mujahid.data.Avanza;
import mujahid.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();

        System.out.println(avanza.getTier());
    }
}
