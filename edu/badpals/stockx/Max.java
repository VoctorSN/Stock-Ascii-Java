package edu.badpals.stockx;

import java.util.List;
import java.util.Optional;

public class Max implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;
    public Max(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> max = new AndCriteria(this.criteria,this.otherCriteria)
                .checkCriteria(item)
                .stream()
                .max(Offer::compareTo);
        return max.isPresent() ? List.of(max.get()) : List.of();
    }
}
