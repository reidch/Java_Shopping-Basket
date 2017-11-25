package com.example.carolinereid.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 25/11/2017.
 */

public class TestItem {
    Item item;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;

    @Before
    public void before() {
        item = new Item("Crema e gusto espresso", "Lavazza", "350g", 4);
        item1 = new Item("semi-skimmed milk", "Grahams", "1 litre", 1);
        item2 = new Item("demerara sugar", "Tate and Lyle", "500g", 2);
        item3 = new Item("Choco Leibniz biscuits", "Bahlsen", "250g", 2);
        item4 = new Item("dark chocolate gingers", "Border biscuits", "250g", 1);
        item5 = new Item("dishwasher tablets", "Finish", "72 pack", 10);
    }

    @Test
    public void hasDescription() {
        assertEquals("dark chocolate gingers", item4.getDescription());
    }

    @Test
    public void hasBrand() {
        assertEquals("Bahlsen", item3.getBrand());
    }

    @Test
    public void hasQuantity() {
        assertEquals("1 litre", item1.getQuantity());
    }

    @Test
    public void hasPrice() {
        assertEquals(2, item2.getPrice(), 0.01);
    }

    @Test
    public void checkCanChangePrice() {
        item.setPrice(5);
        assertEquals(5, item.getPrice(), 0.1);
    }
}
