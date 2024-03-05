package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Offer;

import java.util.List;

public class LastSale implements Criteria {
    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return List.of(new Sales().checkCriteria(item).getLast());
    }
}
