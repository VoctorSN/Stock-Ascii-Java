package edu.badpals.stockx;

import java.util.ArrayList;
import java.util.List;

public class Asks implements Criteria{
    public Asks(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> asks = new ArrayList<>();
        for (Offer oferta:item.offers()){
            if (oferta instanceof Ask){
            asks.add(oferta);
            }
        }
        return asks;
    }
}
