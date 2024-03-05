package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Offer;

import java.util.List;
import java.util.Objects;

public class Size implements Criteria {
    private final String size;
    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(i-> Objects.equals(i.size(), this.size))
                .toList();
    }
}
