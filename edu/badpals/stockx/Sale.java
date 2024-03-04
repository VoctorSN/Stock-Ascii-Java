package edu.badpals.stockx;

public class Sale implements Offer {
    private String size;
    private Integer bid;

    public Sale(String size, int bid) {
        this.bid = bid;
        this.size = size;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer offer) {
        return 0;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "size='" + size + '\'' +
                ", bid=" + bid +
                '}';
    }
}
