package mujahid.util;

public class MathUtil {
    public static int sum(int... numbers) {
        int total = 0;
        for(var value: numbers) {
            total += value;
        }
        return total;
    }
}
