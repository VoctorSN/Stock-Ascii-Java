package edu.badpals.stockx;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria{

    public MaxBid(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> bids = item.offers()
                .stream()
                .filter(i->i instanceof Bid)
                .max(Offer::compareTo);
        return bids.isPresent() ? List.of(bids.get()) : List.of();

    }
}
