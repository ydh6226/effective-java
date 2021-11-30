package com.effectivejava.builder;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {
        HAM, BEAR, FRUIT, ONION
    }

    private final Set<Topping> toppings;

    protected Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }

    protected abstract static class Builder<T> {
        private final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        public abstract Pizza build();

        protected abstract T self();
    }

}
