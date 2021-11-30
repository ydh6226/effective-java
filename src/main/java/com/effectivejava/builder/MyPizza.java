package com.effectivejava.builder;

public class MyPizza extends Pizza {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    private MyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private Size size;

        private Builder() {
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        @Override
        public Pizza build() {
            return new MyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

}
