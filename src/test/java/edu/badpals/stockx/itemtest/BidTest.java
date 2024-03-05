package edu.badpals.stockx.itemtest;

import edu.badpals.stockx.offer.Bid;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BidTest {

    @Test
    public void constructorTest() {
        Bid bid = new Bid("9.5", 282);
        assertEquals(282, bid.value());
        assertEquals("9.5", bid.size());
    }

}