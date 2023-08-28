package mujahid.application;

import mujahid.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook pro", 30_000_000);
        // System.out.println(product.name); //akan error kalo product name itu protected
    }
}
