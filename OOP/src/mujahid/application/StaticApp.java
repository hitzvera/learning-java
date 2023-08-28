package mujahid.application;

import static mujahid.data.Constant.*;
import mujahid.data.Country;
import mujahid.util.MathUtil;
import mujahid.data.Application;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION); // karena sudah diimport static jadi ga usah lagi Constant.APPLICATION
        System.out.println(BASE_URL);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();

        city.setName("Bandung");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
