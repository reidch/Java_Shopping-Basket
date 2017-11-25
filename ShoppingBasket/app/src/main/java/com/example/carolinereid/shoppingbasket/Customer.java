package com.example.carolinereid.shoppingbasket;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class Customer {
    private String name;
    protected boolean loyaltyCard;

    public Customer(String name, boolean loyaltyCard) {
        this.name = name;
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasLoyaltyCard() {
        return this.loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
