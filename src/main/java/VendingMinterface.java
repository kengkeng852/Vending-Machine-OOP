public interface VendingMinterface {
    void qtycheck(int qty,int tqty);

    int compareTo(Drinks other);
    int compareTo(Food other);
}
