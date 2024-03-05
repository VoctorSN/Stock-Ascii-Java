package edu.badpals.stockx;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria{
    public MinAsk(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> min = item.offers()
                .stream()
                .filter(i->i instanceof Ask)
                .min(Offer::compareTo);
        return min.isPresent() ? List.of(min.get()): List.of();
    }
}
