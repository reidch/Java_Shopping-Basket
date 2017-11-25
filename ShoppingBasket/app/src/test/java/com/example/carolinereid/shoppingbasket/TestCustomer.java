package com.example.carolinereid.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class TestCustomer {
    Customer customer;
    Customer customer1;

    @Before
    public void before(){
        customer = new Customer("Joseph Cook", true);
        customer1 = new Customer("Ann Chambers", false);
    }

    @Test
    public void hasName() {
        assertEquals("Joseph Cook", customer.getName());
    }

    @Test
    public void checkChangeName() {
        customer1.setName("Ann Wilson");
        assertEquals("Ann Wilson", customer1.getName());
    }

    @Test
    public void checkHasLoyaltyCard() {
        assertTrue(customer.hasLoyaltyCard());
    }

    @Test
    public void checkNoLoyaltyCard() {
        assertFalse(customer1.hasLoyaltyCard());
    }

    @Test
    public void checkCanLoseLoyaltyCard() {
        customer.setLoyaltyCard(false);
        assertFalse(customer.hasLoyaltyCard());
    }

    @Test
    public void checkCanGetLoyaltyCard() {
        customer1.setLoyaltyCard(true);
        assertTrue(customer1.hasLoyaltyCard());
    }
}
