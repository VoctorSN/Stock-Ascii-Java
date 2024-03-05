package edu.badpals.stockx.offer;

public interface Offer {
    public String size();
    public int value();
    public int compareTo(Offer offer);
}
