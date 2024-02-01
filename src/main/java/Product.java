import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Product implements FilePersistence  {
    private String pname;
    private int qty;
    private double price;
    Product(){
    }
    Product(String pname, int qty, double price) {
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }
    public String getPname() {return pname;}

    public int getQty() {return qty;}
    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.format("%-10s %12.2f %5d \n", pname, price, qty);
    }

    File inputFile = new File ("input.txt");
    File outputFile = new File("output.txt");

    public void readFromFile(File inputFile) throws IOException, NoSuchElementException {
        Scanner in = new Scanner(new File("inputFile"));
    }

    public void writeToFile(File outputFile) throws IOException{
        PrintWriter out = new PrintWriter("outputFile");
    }
}