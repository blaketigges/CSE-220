import java.util.ArrayList;

public class TransactionDB {
    private ArrayList<Transaction> transactions;
    public TransactionDB() {
        transactions = new ArrayList<Transaction>();
    }
    public void add(Transaction newtr) {
        // add new transaction to database
        transactions.add(newtr);
    }
    public String toString() {
        // return a string consisting of every individual transaction each on a separate line
        String output = "";
        for (Transaction item : transactions) {
            output += item + "\n";
        }
        return output;
    }
    public int numTransactions() {
        // return the number of transactions in the database
        return transactions.size();
    }
    public double avgRecentCost() {
        // return the average cost of all transactions made in the most recent year within the database
        int recentYear = 0;
        double totalCost = 0;
        int numTrans = 0;
        for (Transaction item : transactions) {
            if (item.getYear() > recentYear) {
                recentYear = item.getYear();
            }
        }
        for (Transaction item : transactions) {
            if (item.getYear() == recentYear) {
                totalCost += item.getSalesPrice();
                numTrans++;
            }
        }
        return totalCost / numTrans;
    }
}
