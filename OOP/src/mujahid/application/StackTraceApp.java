package mujahid.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try{
            sampleError();
        }catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        String[] names = {
                "Mujahid", "Ansori", "Majid"
        };

        try {
            System.out.println(names[100]);
        }catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
