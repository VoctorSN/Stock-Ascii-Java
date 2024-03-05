package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.offer.Offer;

import java.util.List;
import java.util.Optional;

public class LastSale implements Criteria {
    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> salesList = new Sales().checkCriteria(item);

        return salesList.isEmpty()?
                List.of()
                : List.of(salesList.get(salesList.size() -1));
    }
}
