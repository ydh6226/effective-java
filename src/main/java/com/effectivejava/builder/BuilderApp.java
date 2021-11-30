package com.effectivejava.builder;

import com.effectivejava.builder.MyPizza;
import com.effectivejava.builder.Pizza;

public class BuilderApp {

    public static void main(String[] args) {
        Pizza pizza = MyPizza.builder()
                .size(MyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.BEAR)
                .addTopping(Pizza.Topping.FRUIT)
                .build();

        System.out.println("pizza = " + pizza);

    }
}
