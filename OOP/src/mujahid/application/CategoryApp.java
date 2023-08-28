package mujahid.application;

import mujahid.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();

        category.setId("1");

        System.out.println(category.getId());

        category.setId(null); // tidak akan berubah ke null karena sudah ada validation di setId();

        System.out.println(category.getId());

    }
}
