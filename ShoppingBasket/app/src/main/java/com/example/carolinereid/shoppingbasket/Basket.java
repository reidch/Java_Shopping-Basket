package com.example.carolinereid.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Basket {
    private ArrayList<Buyable> contents;
    private Customer customer;

    public Basket(Customer customer) {
        this.contents = new ArrayList<>();
        this.customer = customer;
    }

    public int countContents() {
        return this.contents.size();
    }

    public void addItem(Buyable item) {
        this.contents.add(item);
    }

    public void removeItem(Buyable item) {
        this.contents.remove(item);
    }

    public void emptyBasket() {
        this.contents.clear();
    }

//    totalling the value of all items in basket
    protected double getTotalValue() {
        double totalValue = 0;
        for (Buyable item : contents) {
            totalValue += item.getPrice();
        }
        return totalValue;
    }

//    I can't get this to return the correct amount
//    if I could get it to work, I would incorporate it into the other discount functions, as the first thing to check for.

//    public double applyBuyOneGetOneFree(int barcode) {
//        double totalValue = getTotalValue();
//        for (Buyable item : contents) {
//            if (barcode == barcode) {
//                return totalValue - item.getPrice();
//            }
//        }
//        return totalValue;
//    }

//    applying 10% discount to total for purchase over £20
    protected double getDiscountedTotal(double totalValue) {
        if (totalValue > 20) {
            return totalValue - ((totalValue/100) * 10);
        } else {
            return totalValue;
        }
    }

//    applying the 10% discount first (for purchases over £29), then the 2% discount for customers with loyalty cards
    protected double getCumulativeLoyaltyDiscountTotal(double totalValue) {
        if (totalValue > 20 && customer.hasLoyaltyCard()) {
            return (totalValue - ((totalValue / 100) * 10)) * 0.98;
        } else if (totalValue <= 20 && customer.hasLoyaltyCard()) {
            return totalValue - ((totalValue / 100) * 2);
        } else {
            return totalValue;
        }
    }
}