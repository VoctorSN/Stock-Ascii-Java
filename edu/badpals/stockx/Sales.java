package edu.badpals.stockx;

import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria{
    public Sales(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(i->i instanceof Sale)
                .collect(Collectors.toList());
    }
}
