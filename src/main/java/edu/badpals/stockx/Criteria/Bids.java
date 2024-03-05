package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Bid;
import edu.badpals.stockx.offer.Offer;

import java.util.Comparator;
import java.util.List;

public class Bids implements Criteria {
    public Bids(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(i-> i instanceof Bid)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
