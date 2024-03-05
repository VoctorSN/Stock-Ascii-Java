package edu.badpals.stockx;

import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> first = criteria.checkCriteria(item);
        List<Offer> second = otherCriteria.checkCriteria(item);
        return first.stream()
                .filter(i->second.contains(i))
                .collect(Collectors.toList());
    }
}
