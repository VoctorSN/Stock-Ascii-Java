package edu.badpals.stockx.criteriatest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import edu.badpals.stockx.Criteria.*;
import edu.badpals.stockx.item.Sneaker;
import edu.badpals.stockx.offer.Ask;
import edu.badpals.stockx.offer.Bid;
import edu.badpals.stockx.offer.Offer;
import org.junit.Test;

public class MinTest {

    @Test
    public void checkCriteria_max_size_bid_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria size = new Size("13");
        Criteria bids = new Asks();
        Criteria max = new Min(size, bids);

        List<Offer> filteredSize = max.checkCriteria(sneaker);
        assertTrue(filteredSize.stream().allMatch(o -> o.size().equals("13")));
        assertTrue(filteredSize.stream().allMatch(o -> o instanceof Ask));
        assertEquals(333, filteredSize.get(0).value());
    }

    @Test
    public void checkCriteria_no_max_test() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");

        Criteria size = new Size("13");
        Criteria bids = new Bids();
        Criteria max = new Min(size, bids);

        List<Offer> filteredSize = max.checkCriteria(sneaker);
        assertTrue(filteredSize.isEmpty());
    }
}