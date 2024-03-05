package edu.badpals.stockx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria{
    public Bids(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bids = new ArrayList<>();
        for (Offer oferta:item.offers()){
            if (oferta instanceof Bid){
                bids.add(oferta);
            }
        }
        return bids;
    }
}
