package mujahid.application;

import mujahid.data.City;
import mujahid.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // Location location = new Location(); // akan error karena abstract class tidak bisa dibuat object secara langsung
        City city = new City();
        city.name = "bandung";

        System.out.println();
    }
}
