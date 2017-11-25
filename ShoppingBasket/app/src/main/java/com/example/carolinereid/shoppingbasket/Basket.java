package com.example.carolinereid.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Basket {
    private ArrayList<Buyable> contents;
    protected double totalValue;
    //    Customer customer;

    public Basket() {
        this.contents = new ArrayList<>();
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

    public double getTotalValue() {
        double totalValue = 0;
        for (Buyable item : contents) {
            totalValue += item.getPrice();
        }
        return totalValue;
    }

    public double applyHighSpendDiscount() {
        if (totalValue > 20) {
            totalValue *= 0.8;
        }
        return totalValue;
    }

//    public void applyBuyOneGetOneFree() {
//        for (Buyable item : contents) {
//            boolean retval = contents.contains(item);
//            if (retval == true) {
//                totalValue = totalValue - item.getPrice();
//            }
//        }
//    }

//    public void applyLoyaltyDiscount() {
//        if(customer.hasLoyaltyCard()) {
//            getTotalValue()
//        }
//    }
}