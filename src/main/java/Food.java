import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Food extends Product implements VendingMinterface, FilePersistence {
    private double totalprice;
    private int totalqty;
    Food[] food = new Food[4];

    Food() {
        food[0] = new Food("Chips", super.getQty(), 15, totalprice, 15);
        food[1] = new Food("Sandwich", super.getQty(), 25.0, totalprice, 12);
        food[2] = new Food("Chocolate", super.getQty(), 10.0, totalprice, 20);
        food[3] = new Food("Cookie", super.getQty(), 12.0, totalprice, 10);
    }

    public Food(String pname, int qty, double price, double tprice, int totalqty) {
        super(pname, qty, price);
        this.totalprice = tprice;
        this.totalqty = totalqty;
    }

    Food[] getItems() {
        return food;
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
        if (this.totalqty < other.getTotalqty()) {
            return 1;
        }
        return 0;
    }

    public int compareTo(Food other) {
        return 1;
    }

    public void readFromFile(File inputFile) throws IOException, NoSuchElementException {
        Scanner in = new Scanner(inputFile);
    }

    public void writeToFile(File outputFile) throws IOException{
        PrintWriter out = new PrintWriter( outputFile);
        out.println("keng");
        out.println("public class Food extends Product implements VendingMinterface, FilePersistence {\n" +
                "    private double totalprice;\n" +
                "    private int totalqty;\n" +
                "    Food[] food = new Food[4];\n" +
                "\n" +
                "    Food() {\n" +
                "        food[0] = new Food(\"Chips\", super.getQty(), 15, totalprice, 15);\n" +
                "        food[1] = new Food(\"Sandwich\", super.getQty(), 25.0, totalprice, 12);\n" +
                "        food[2] = new Food(\"Chocolate\", super.getQty(), 10.0, totalprice, 20);\n" +
                "        food[3] = new Food(\"Cookie\", super.getQty(), 12.0, totalprice, 10);\n" +
                "    }\n" +
                "\n" +
                "    public Food(String pname, int qty, double price, double tprice, int totalqty) {\n" +
                "        super(pname, qty, price);\n" +
                "        this.totalprice = tprice;\n" +
                "        this.totalqty = totalqty;\n" +
                "    }\n" +
                "\n" +
                "    Food[] getItems() {\n" +
                "        return food;\n" +
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
                "        if (this.totalqty < other.getTotalqty()) {\n" +
                "            return 1;\n" +
                "        }\n" +
                "        return 0;\n" +
                "    }\n" +
                "\n" +
                "    public int compareTo(Food other) {\n" +
                "        return 1;\n" +
                "    }\n" +
                "\n" +
                "}");
        out.close();
    }


}

