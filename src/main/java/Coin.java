import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Coin implements FilePersistence {
    private int oneBaht;
    private int fiveBaht;
    private int tenBaht;
    private int hundredBaht;
    private int value;

    public Coin(int oneBaht, int fiveBaht, int tenBaht, int hundredBaht) {
        this.oneBaht = oneBaht;
        this.fiveBaht = fiveBaht;
        this.tenBaht = tenBaht;
        this.hundredBaht = hundredBaht;
    }

    public int getOneBath() {
        return oneBaht;
    }

    public int getFiveBath() {
        return fiveBaht;
    }

    public int getTenBath() {
        return tenBaht;
    }

    public int getHundredBaht() {
        return hundredBaht;
    }

    public int getValue() {
        value = (oneBaht * 1) + (fiveBaht * 5) + (tenBaht * 10) + (hundredBaht * 100);
        return this.value;
    }

    public void readFromFile(File inputFile) throws IOException, NoSuchElementException {
        Scanner in = new Scanner(new File("inputFile"));
    }
    public void writeToFile(File outputFile) throws IOException{
        PrintWriter out = new PrintWriter(outputFile);
        out.println("public class Coin implements FilePersistence {\n" +
                "    private int oneBaht;\n" +
                "    private int fiveBaht;\n" +
                "    private int tenBaht;\n" +
                "    private int hundredBaht;\n" +
                "    private int value;\n" +
                "\n" +
                "    public Coin(int oneBaht, int fiveBaht, int tenBaht, int hundredBaht) {\n" +
                "        this.oneBaht = oneBaht;\n" +
                "        this.fiveBaht = fiveBaht;\n" +
                "        this.tenBaht = tenBaht;\n" +
                "        this.hundredBaht = hundredBaht;\n" +
                "    }\n" +
                "\n" +
                "    public int getOneBath() {\n" +
                "        return oneBaht;\n" +
                "    }\n" +
                "\n" +
                "    public int getFiveBath() {\n" +
                "        return fiveBaht;\n" +
                "    }\n" +
                "\n" +
                "    public int getTenBath() {\n" +
                "        return tenBaht;\n" +
                "    }\n" +
                "\n" +
                "    public int getHundredBaht() {\n" +
                "        return hundredBaht;\n" +
                "    }\n" +
                "\n" +
                "    public int getValue() {\n" +
                "        value = (oneBaht * 1) + (fiveBaht * 5) + (tenBaht * 10) + (hundredBaht * 100);\n" +
                "        return this.value;\n" +
                "    }\n" +
                "\n" +
                "}");
        out.close();
    }

}
