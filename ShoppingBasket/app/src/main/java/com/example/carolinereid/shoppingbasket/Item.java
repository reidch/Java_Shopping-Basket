package com.example.carolinereid.shoppingbasket;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Item {
    private String description;
    private String brand;
    private double price;
//    bogofStatus


    public Item(String description, String brand, double price) {
        this.description = description;
        this.brand = brand;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
