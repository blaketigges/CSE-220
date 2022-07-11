public class Collector {
    private int colID;
    private String colName;
    private char category;
    public Collector(int colID, String colName, char category) {
        this.colID = colID;
        this.colName = colName;
        this.category = category;
    }
    public int getColID() {
        return colID;
    }
    public String getColName() {
        return colName;
    }
    public char getCategory() {
        return category;
    }
    public String toString() {
        return "{" + colID + ", " + colName + ", " + category + "}";
    }
}
