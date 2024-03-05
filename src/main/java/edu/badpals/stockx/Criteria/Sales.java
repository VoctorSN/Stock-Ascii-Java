package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Offer;
import edu.badpals.stockx.offer.Sale;

import java.util.List;

public class Sales implements Criteria {
    public Sales(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(i->i instanceof Sale)
                .toList();
    }
}
