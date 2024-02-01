import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Change extends Coin implements FilePersistence {
    private double change;

    private double value;
    Scanner in = new Scanner(System.in);

    Change(int oneBaht, int twoBaht, int fiveBaht, int tenBaht) {
        super(oneBaht, twoBaht, fiveBaht, tenBaht);
    }

    public double getChange(double amount) {
        change = super.getValue() - amount;
        return change;
    }

    public void checkChange(double amount) {
        if (super.getValue() - amount > 0) {
            System.out.println("here is your change :" + getChange(amount) + "Baht");
        } else if (super.getValue() - amount == 0) {
            System.out.println("The money you gave matches the price of the products.");
        } else if (super.getValue() - amount < 0) {
            String pre;
            System.out.println("add more coin");
            System.out.println("The money you gave is not enough for products give us another " + (amount - super.getValue()) + "Baht");
            System.out.println("you have enough money to add more?(y or n)");
            pre = in.nextLine();
            if (pre.charAt(0) == 'y') {
                System.out.println(" (1Baht 5Baht 10Baht 100Baht)");
                pre = in.next();
                int oneB = Integer.parseInt(pre);
                pre = in.next();
                int fiveB = Integer.parseInt(pre);
                pre = in.next();
                int tenB = Integer.parseInt(pre);
                pre = in.next();
                int hunB = Integer.parseInt(pre);
                int total = (oneB * 1) + (fiveB * 5) + (tenB * 10) + (hunB * 100);
                if (total + super.getValue() - amount > 0) {
                    System.out.println("here is your change :" + (total + super.getValue() - amount) + "Baht");
                }
                if (total + super.getValue() - amount == 0) {
                    System.out.println("The money you gave matches the price of the products.");
                }
            } else if (pre.charAt(0) == 'n') {
                System.exit(-1);
            }
        }
    }

    public void readFromFile(File inputFile) throws IOException, NoSuchElementException {
        Scanner in = new Scanner(new File("inputFile"));
    }
    public void writeToFile(File outputFile,File outputFile2) throws IOException{
        super.writeToFile(outputFile2);
        PrintWriter out = new PrintWriter(outputFile);
        out.println("public class Change extends Coin implements FilePersistence {\n" +
                "    private double change;\n" +
                "\n" +
                "    private double value;\n" +
                "    Scanner in = new Scanner(System.in);\n" +
                "\n" +
                "    Change(int oneBaht, int twoBaht, int fiveBaht, int tenBaht) {\n" +
                "        super(oneBaht, twoBaht, fiveBaht, tenBaht);\n" +
                "    }\n" +
                "\n" +
                "    public double getChange(double amount) {\n" +
                "        change = super.getValue() - amount;\n" +
                "        return change;\n" +
                "    }\n" +
                "\n" +
                "    public void checkChange(double amount) {\n" +
                "        if (super.getValue() - amount > 0) {\n" +
                "            System.out.println(\"here is your change :\" + getChange(amount) + \"Baht\");\n" +
                "        } else if (super.getValue() - amount == 0) {\n" +
                "            System.out.println(\"The money you gave matches the price of the products.\");\n" +
                "        } else if (super.getValue() - amount < 0) {\n" +
                "            String pre;\n" +
                "            System.out.println(\"add more coin\");\n" +
                "            System.out.println(\"The money you gave is not enough for products give us another \" + (amount - super.getValue()) + \"Baht\");\n" +
                "            System.out.println(\"you have enough money to add more?(y or n)\");\n" +
                "            pre = in.nextLine();\n" +
                "            if (pre.charAt(0) == 'y') {\n" +
                "                System.out.println(\" (1Baht 5Baht 10Baht 100Baht)\");\n" +
                "                pre = in.next();\n" +
                "                int oneB = Integer.parseInt(pre);\n" +
                "                pre = in.next();\n" +
                "                int fiveB = Integer.parseInt(pre);\n" +
                "                pre = in.next();\n" +
                "                int tenB = Integer.parseInt(pre);\n" +
                "                pre = in.next();\n" +
                "                int hunB = Integer.parseInt(pre);\n" +
                "                int total = (oneB * 1) + (fiveB * 5) + (tenB * 10) + (hunB * 100);\n" +
                "                if (total + super.getValue() - amount > 0) {\n" +
                "                    System.out.println(\"here is your change :\" + (total + super.getValue() - amount) + \"Baht\");\n" +
                "                }\n" +
                "                if (total + super.getValue() - amount == 0) {\n" +
                "                    System.out.println(\"The money you gave matches the price of the products.\");\n" +
                "                }\n" +
                "            } else if (pre.charAt(0) == 'n') {\n" +
                "                System.exit(-1);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");
        out.close();
    }


}
