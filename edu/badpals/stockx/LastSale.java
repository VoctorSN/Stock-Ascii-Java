package edu.badpals.stockx;

import java.util.List;

public class LastSale implements Criteria{
    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Offer last = new Sales().checkCriteria(item).getLast();
        return List.of(last);
    }
}
