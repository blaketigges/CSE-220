
public class TestTransactions
{
    public static void main(String [] args)
    {
        Collector col1 = new Collector(1,"B&B Bros",'C');
        Collector col2 = new Collector(2,"Metro M",'M');
        Collector col3 = new Collector(3,"Rare Goods",'C');
        Collector col4 = new Collector(4,"FA Ctr",'M');
        Collector col5 = new Collector(5,"Mason C",'N');
        Collector col6 = new Collector(6,"CL Fabrics",'N');
        Transaction[] testtr = {new Transaction("Antique 91",col1,col2,0,2004),
                new Transaction("Painting 117",col3,col6,300000,2020),
                new Transaction("Ceramics 103",col6,col5,40000,2020),
                new Transaction("Ceramics 112",col3,col5,100000,2014),
                new Transaction("Antique 221",col5,col3,120000,2020),
                new Transaction("Painting 113",col5,col4,0,2018)};
        TransactionDB testdb = new TransactionDB();
        for (Transaction titem : testtr)
        {
            testdb.add(titem);
        }
        System.out.println(testdb);
        java.text.DecimalFormat dF = new java.text.DecimalFormat("0.00");
        System.out.println("The database has " + testdb.numTransactions() + " transactions in total.");
        if (testdb.numTransactions() > 0) {
            System.out.println("Transactions made in the most recent year have an avg price of $" + dF.format(testdb.avgRecentCost()) + ".");
        }

    }
}