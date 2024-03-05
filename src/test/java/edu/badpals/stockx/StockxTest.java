package edu.badpals.stockx;

import edu.badpals.stockx.item.Sneaker;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class StockxTest {
    @Test
    public void testAppHasADraw() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull("app debe tener un draw", Stockx.draw(sneaker));
    }
}