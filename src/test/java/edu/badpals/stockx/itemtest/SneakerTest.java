package edu.badpals.stockx.itemtest;

import edu.badpals.stockx.item.Sneaker;
import edu.badpals.stockx.offer.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SneakerTest {

    @Test
    public void constructorTest() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        assertNotNull(sneaker);
        assertEquals("555088-105", sneaker.getStyle());
        assertEquals("Jordan 1", sneaker.getName());
    }

    @Test
    public void addOfferBid() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Bid bid = new Bid("9.5", 282);
        sneaker.add(bid);
        assertEquals(1, sneaker.offers().size());
    }
    @Test
    public void addOfferAsk() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Ask ask = new Ask("15", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 340));
        sneaker.add(new Ask("13", 341));
        assertEquals(4, sneaker.offers().size());
    }

    @Test
    public void addOffer() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("9.5", 282));
        sneaker.add(new Ask("15", 288));
        Offer ask = new Ask("13", 333);
        sneaker.add(ask);
        assertEquals(3, sneaker.offers().size());
    }

    public static class BidTest {

        @Test
        public void constructorTest() {
            Bid bid = new Bid("9.5", 282);
            assertEquals(282, bid.value());
            assertEquals("9.5", bid.size());
        }

    }
}
