package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Criteria.Criteria;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Ask;
import edu.badpals.stockx.offer.Offer;

import java.util.List;

public class Asks implements Criteria {
    public Asks(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(i->i instanceof Ask)
                .toList();
    }
}
