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

    @Before
    public void before() {
        basket = new Basket();
        item = new Item("Crema e gusto espresso", "Lavazza", "350g", 4.26);
        item1 = new Item("semi-skimmed milk", "Grahams", "1 litre", 0.79);
        item2 = new Item("demerara sugar", "Tate and Lyle", "500g", 1.25);
        item3 = new Item("Choco Leibniz biscuits", "Bahlsen", "250g", 1.58);
        item4 = new Item("dark chocolate gingers", "Border biscuits", "250g", 1.00);
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
}
