package mujahid.application;

import mujahid.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // anonymous class
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
    }

}
