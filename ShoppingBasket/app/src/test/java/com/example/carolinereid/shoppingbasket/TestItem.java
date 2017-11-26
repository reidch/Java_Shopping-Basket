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
        item = new Item("Crema e gusto espresso", "Lavazza", 123456, 4.00);
        item1 = new Item("semi-skimmed milk", "Grahams", 234567, 1.00);
        item2 = new Item("demerara sugar", "Tate and Lyle", 345678, 2.00);
        item3 = new Item("Choco Leibniz biscuits", "Bahlsen", 456789, 2.00);
        item4 = new Item("dark chocolate gingers", "Border biscuits", 567890, 1.00);
        item5 = new Item("dishwasher tablets", "Finish", 678901, 10.00);
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
    public void hasBarcode() {
        assertEquals(234567, item1.getBarcode());
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
