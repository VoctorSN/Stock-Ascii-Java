package edu.badpals.stockx.offer;

public interface Offer extends Comparable<Offer>{
    public String size();
    public int value();
    public int compareTo(Offer offer);
}
