package com.example.carolinereid.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Basket {
    private ArrayList<Buyable> contents;

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
    public double getDiscountedTotal(double totalValue) {
        if (totalValue > 20) {
            return totalValue - ((totalValue/100) * 10);
        } else {
            return totalValue;
        }
    }

//    this appears to pass but I know there's a problem with it because I shouldn't have to pass in a specific instance of customer

//    applying the 10% discount first (for purchases over £29), then the 2% discount for customers with loyalty cards
    public double getCumulativeLoyaltyDiscountTotal(double totalValue) {
        Customer customer = new Customer("Joseph Cook", true);
        if (totalValue > 20 && customer.hasLoyaltyCard()) {
            return (totalValue - ((totalValue / 100) * 10)) * 0.98;
        } else if (totalValue <= 20 && customer.hasLoyaltyCard()) {
            return totalValue - ((totalValue / 100) * 2);
        } else {
            return totalValue;
        }
    }
}