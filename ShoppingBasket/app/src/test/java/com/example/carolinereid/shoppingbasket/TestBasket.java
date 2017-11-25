package com.example.carolinereid.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class TestBasket {
    Basket basket;
    Item item;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;

    @Before
    public void before() {
        basket = new Basket();
        item = new Item("Crema e gusto espresso", "Lavazza", "350g", 4);
        item1 = new Item("semi-skimmed milk", "Grahams", "1 litre", 1);
        item2 = new Item("demerara sugar", "Tate and Lyle", "500g", 2);
        item3 = new Item("Choco Leibniz biscuits", "Bahlsen", "250g", 2);
        item4 = new Item("dark chocolate gingers", "Border biscuits", "250g", 1);
        item5 = new Item("dishwasher tablets", "Finish", "72 pack", 10);
    }

    @Test
    public void testCheckContents() {
        assertEquals(0, basket.countContents());
    }

    @Test
    public void canAddItems() {
        basket.addItem(item);
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(3, basket.countContents());
    }

    @Test
    public void canRemoveItems() {
        basket.addItem(item);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem(item2);
        assertEquals(2, basket.countContents());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.emptyBasket();
        assertEquals(0, basket.countContents());
    }

    @Test
    public void testGetTotalValue() {
        basket.addItem(item);
        assertEquals(4, basket.getTotalValue(), 0.1);
    }

    @Test
    public void testGetUpdatedTotalValue() {
        basket.addItem(item);
        basket.addItem(item1);
        basket.addItem(item4);
        assertEquals(6, basket.getTotalValue(), 0.1);
    }

    @Test
    public void testGetRevisedTotalValue() {
        basket.addItem(item);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.removeItem(item2);
        assertEquals(5, basket.getTotalValue(), 0.1);
    }

    @Test
    public void testApplyHighSpendDiscount() {
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item5);
        basket.applyHighSpendDiscount(0.8);
        assertEquals(17.6, basket.getTotalValue(), 0.1);
    }

//    @Test
//    public void testBuyOneGetOneFree() {
//        basket.addItem(item);
//        basket.addItem(item);
//        basket.addItem(item2);
//        assertEquals(6, basket.getTotalValue(), 0.1);
//    }

}
