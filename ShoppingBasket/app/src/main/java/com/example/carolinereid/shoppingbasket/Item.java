package com.example.carolinereid.shoppingbasket;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Item implements Buyable {
    private String description;
    private String quantity;
    private String brand;
    protected double price;


    public Item(String description, String brand, String quantity, double price) {
        this.description = description;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
