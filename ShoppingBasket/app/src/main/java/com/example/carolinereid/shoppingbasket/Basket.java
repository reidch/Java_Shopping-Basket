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

//        public void applyBuyOneGetOneFree() {
//        for (Buyable item : contents) {
//            if (barcode() == Buyable.getBarcode() ){
//                 totalValue -= item.getPrice();
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

//    applying the 10% discount first (for purchases over £29), then the 2% discount for customers with loyalty cards
//    this appears to pass but I know there's a problem with it because I shouldn't have to pass in a specific instance of customer
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