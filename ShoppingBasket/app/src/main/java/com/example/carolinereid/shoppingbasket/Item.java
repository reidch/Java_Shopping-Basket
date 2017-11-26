package com.example.carolinereid.shoppingbasket;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Item implements Buyable {
    private String description;
    private String brand;
    private int barcode;
    private double price;


    public Item(String description, String brand, int barcode, double price) {
        this.description = description;
        this.brand = brand;
        this.barcode = barcode;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getBarcode() {
        return this.barcode;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
