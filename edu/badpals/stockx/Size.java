package edu.badpals.stockx;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Size implements Criteria{
    private final String size;
    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(i-> Objects.equals(i.size(), this.size))
                .collect(Collectors.toList());
    }
}
