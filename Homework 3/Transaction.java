public class Transaction {
    private String pieceName;
    private Collector seller;
    private Collector buyer;
    private double salesPrice;
    private int year;
    public Transaction(String pieceName, Collector seller, Collector buyer, double salesPrice, int year) {
        this.pieceName = pieceName;
        this.seller = seller;
        this.buyer = buyer;
        this.salesPrice = salesPrice;
        this.year = year;
    }

    public String getPieceName() {
        return pieceName;
    }

    public Collector getSeller() {
        return seller;
    }

    public Collector getBuyer() {
        return buyer;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public int getYear() {
        return year;
    }
    public String toString() {
        return "[" + pieceName + " sold by " + seller + " to " + buyer + " in " + year + " for $" + salesPrice + "]";
    }
}
