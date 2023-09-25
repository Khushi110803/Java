package com.example.stlab200539535week2;

public class Mobilephone {
    private String brand;
    private String model;
    private double price;

    public Mobilephone (String brand, String model, double price) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }

        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mobile Phone Info:\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Price: $" + price;
    }


}
