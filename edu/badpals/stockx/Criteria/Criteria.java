package edu.badpals.stockx.Criteria;


import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Offer;

import java.util.List;

public interface Criteria {
    public List<Offer> checkCriteria(Item item);
}
