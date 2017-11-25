package com.example.carolinereid.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Basket {
    private ArrayList<Buyable> contents;
    protected double totalValue;
    Customer customer;

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

//    totalling the value of all items in basket
    public double getTotalValue() {
        double totalValue = 0;
        for (Buyable item : contents) {
            totalValue += item.getPrice();
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

//    applying 10% discount to total for purchase over £20
    public double getDiscountedTotal(double totalValue) {
        if (totalValue > 20) {
            return totalValue - ((totalValue/100) * 10);
        } else {
            return totalValue;
        }
    }

//    public double getLoyaltyDiscountedTotal(double totalValue) {
//        if (customer.hasLoyaltyCard()) {
//            loyaltyDiscountedTotal = totalValue - ((totalValue/100) * 2);
//        return loyaltyDiscountedTotal;
//        } else {
//            return totalValue;
//        }
//    }

//    public double getLoyaltyDiscountedTotal(double totalValue) {
//        if (customer.hasLoyaltyCard()) {
//            return totalValue - ((totalValue/100) * 2);
//        } else {
//            return totalValue;
//        }
//    }
}