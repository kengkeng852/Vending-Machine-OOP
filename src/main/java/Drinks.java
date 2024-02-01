import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Drinks extends Product implements VendingMinterface, FilePersistence {
    private double totalprice;
    private int totalqty;
    Drinks[] drink = new Drinks[4];

    Drinks() {
        drink[0] = new Drinks("Cola", super.getQty(), 20, totalprice, 20);
        drink[1] = new Drinks("Tea", super.getQty(), 25, totalprice, 10);
        drink[2] = new Drinks("Coffee", super.getQty(), 30, totalprice, 12);
        drink[3] = new Drinks("Milk", super.getQty(), 15, totalprice, 15);
    }

    public Drinks(String pname, int qty, double price, double tprice, int totalqty) {
        super(pname, qty, price);
        this.totalprice = tprice;
        this.totalqty = totalqty;
    }

    Drinks[] getItems() {
        return drink;
    }

    public String getName() {
        return super.getPname();
    }

    public double getPrice() {
        return super.getPrice();
    }

    public int getTotalqty() {
        return totalqty;
    }

    @Override
    public void qtycheck(int qty, int tqty) {
        int toqty = tqty - qty;
        if (toqty < 0) {
            throw new NotEnoughProductException("we don't have enough product");
        }
    }

    @Override
    public void display() {
        System.out.format("%-9s %d pieces %5.2f Baht \n", super.getPname(), super.getQty(), totalprice);
    }

    @Override
    public String toString() {
        return String.format("%-9s %d pieces %5.2f Baht \n", super.getPname(), super.getQty(), totalprice);
    }

    @Override
    public int compareTo(Drinks other) {
        return 1;
    }

    public int compareTo(Food other) {
        if (this.totalqty < other.getTotalqty()) {
            return 1;
        }
        return 0;
    }

    public void readFromFile(File inputFile) throws IOException, NoSuchElementException {
        Scanner in = new Scanner(inputFile);
    }

    public void writeToFile(File outputFile) throws IOException{
        PrintWriter out = new PrintWriter( outputFile);
        out.println("public class Drinks extends Product implements VendingMinterface, FilePersistence {\n" +
                "    private double totalprice;\n" +
                "    private int totalqty;\n" +
                "    Drinks[] drink = new Drinks[4];\n" +
                "\n" +
                "    Drinks() {\n" +
                "        drink[0] = new Drinks(\"Cola\", super.getQty(), 20, totalprice, 20);\n" +
                "        drink[1] = new Drinks(\"Tea\", super.getQty(), 25, totalprice, 10);\n" +
                "        drink[2] = new Drinks(\"Coffee\", super.getQty(), 30, totalprice, 12);\n" +
                "        drink[3] = new Drinks(\"Milk\", super.getQty(), 15, totalprice, 15);\n" +
                "    }\n" +
                "\n" +
                "    public Drinks(String pname, int qty, double price, double tprice, int totalqty) {\n" +
                "        super(pname, qty, price);\n" +
                "        this.totalprice = tprice;\n" +
                "        this.totalqty = totalqty;\n" +
                "    }\n" +
                "\n" +
                "    Drinks[] getItems() {\n" +
                "        return drink;\n" +
                "    }\n" +
                "\n" +
                "    public String getName() {\n" +
                "        return super.getPname();\n" +
                "    }\n" +
                "\n" +
                "    public double getPrice() {\n" +
                "        return super.getPrice();\n" +
                "    }\n" +
                "\n" +
                "    public int getTotalqty() {\n" +
                "        return totalqty;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void qtycheck(int qty, int tqty) {\n" +
                "        int toqty = tqty - qty;\n" +
                "        if (toqty < 0) {\n" +
                "            throw new NotEnoughProductException(\"we don't have enough product\");\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void display() {\n" +
                "        System.out.format(\"%-9s %d pieces %5.2f Baht \\n\", super.getPname(), super.getQty(), totalprice);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() {\n" +
                "        return String.format(\"%-9s %d pieces %5.2f Baht \\n\", super.getPname(), super.getQty(), totalprice);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public int compareTo(Drinks other) {\n" +
                "        return 1;\n" +
                "    }\n" +
                "\n" +
                "    public int compareTo(Food other) {\n" +
                "        if (this.totalqty < other.getTotalqty()) {\n" +
                "            return 1;\n" +
                "        }\n" +
                "        return 0;\n" +
                "    }\n" +
                "\n" +
                "}");
        out.close();
    }

}
