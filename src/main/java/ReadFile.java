import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        int quantity;
        String choiceselect ;
        double tprice = 0.0;
        char choicedo = '\0';
        double amount=0; String pre;
        int oneB=0,fiveB=0,tenB=0,hunB=0;
        int[]  qtyf = new int[4]; int countfood=0;
        int[]  qtyd = new int[4]; int countdrink=0;
        Food f = new Food();
        Food[] foodItems = f.getItems();

        Drinks d =new Drinks();
        Drinks[] drinkItems = d.getItems();

        ArrayList<Food> food = new ArrayList<Food>();
        ArrayList<Drinks> drink = new ArrayList<Drinks>();

        Scanner in = null;
        try {
            File file = new File("input.txt");
            in = new Scanner(file);
            do{
            choiceselect = in.next();
            System.out.println(choiceselect);
            if (choiceselect.charAt(0) == 'f') { //1
                for (int i = 0; i < foodItems.length; i++) {
                    if (countfood == 0) {
                        qtyf[i] = foodItems[i].getTotalqty();
                    }
                }
                countfood++;
                choiceselect = in.next();
                System.out.println(choiceselect);
                if (choiceselect.charAt(0)=='C'&& choiceselect.charAt(choiceselect.length()-1)=='s') {
                    pre=in.next();
                    quantity =Integer.parseInt(pre);
                    tprice = quantity * foodItems[0].getPrice();
                    f.qtycheck(quantity, qtyf[0]);
                    qtyf[0] = qtyf[0] - quantity;
                    food.add(new Food(foodItems[0].getName(), quantity, foodItems[1].getPrice(), tprice, qtyf[0]));
                    System.out.println(foodItems[0].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }
                   else if (choiceselect.charAt(0)=='S'&& choiceselect.charAt(choiceselect.length()-1)=='h') {
                        pre=in.next();
                        quantity =Integer.parseInt(pre);
                        tprice = quantity * foodItems[1].getPrice();
                        f.qtycheck(quantity, qtyf[1]);
                        qtyf[1] = qtyf[1] - quantity;
                        food.add(new Food(foodItems[1].getName(), quantity, foodItems[1].getPrice(), tprice, qtyf[1]));
                        System.out.println(foodItems[1].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                        amount = amount + tprice;
                        System.out.println(amount);
                    }
                else if (choiceselect.charAt(0)=='C'&& choiceselect.charAt(choiceselect.length()-2)=='i') {
                    pre=in.next();
                    quantity =Integer.parseInt(pre);
                    tprice = quantity * foodItems[3].getPrice();
                    f.qtycheck(quantity, qtyf[3]);
                    qtyf[3] = qtyf[3] - quantity;
                    food.add(new Food(foodItems[3].getName(), quantity, foodItems[3].getPrice(), tprice, qtyf[3]));
                    System.out.println(foodItems[3].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }
                else if (choiceselect.charAt(0)=='C'&& choiceselect.charAt(choiceselect.length()-1)=='e') {
                    pre=in.next();
                    quantity =Integer.parseInt(pre);
                    tprice = quantity * foodItems[2].getPrice();
                    f.qtycheck(quantity, qtyf[2]);
                    qtyf[2] = qtyf[2] - quantity;
                    food.add(new Food(foodItems[2].getName(), quantity, foodItems[2].getPrice(), tprice, qtyf[2]));
                    System.out.println(foodItems[2].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }

            }
            else if (choiceselect.charAt(0) == 'd') { //2
                for (int i = 0; i < drinkItems.length; i++) {
                    if (countdrink == 0) {
                        qtyd[i] = drinkItems[i].getTotalqty();
                    }
                }
                countdrink++;
                choiceselect = in.next();
                System.out.println(choiceselect);
                if (choiceselect.charAt(0) == 'C' && choiceselect.charAt(choiceselect.length()-1) == 'a') {
                    System.out.println("how many pieces do you need: ");
                    quantity = in.nextInt();
                    tprice = quantity * drinkItems[0].getPrice();
                    d.qtycheck(quantity, qtyd[0]);
                    qtyd[0] = qtyd[0] - quantity;
                    drink.add(new Drinks(drinkItems[0].getName(), quantity, drinkItems[0].getPrice(), tprice, qtyd[0]));
                    System.out.println(drinkItems[0].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }
                else if (choiceselect.charAt(0) == 'T' && choiceselect.charAt(choiceselect.length()-1) == 'a') {
                    System.out.println("how many pieces do you need: ");
                    quantity = in.nextInt();
                    tprice = quantity * drinkItems[1].getPrice();
                    d.qtycheck(quantity, qtyd[1]);
                    qtyd[1] = qtyd[1] - quantity;
                    drink.add(new Drinks(drinkItems[1].getName(), quantity, drinkItems[1].getPrice(), tprice, qtyd[1]));
                    System.out.println(drinkItems[1].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }
                else if (choiceselect.charAt(0) == 'C' && choiceselect.charAt(choiceselect.length()-1) == 'e') {
                    System.out.println("how many pieces do you need: ");
                    quantity = in.nextInt();
                    tprice = quantity * drinkItems[2].getPrice();
                    d.qtycheck(quantity, qtyd[2]);
                    qtyd[2] = qtyd[2] - quantity;
                    drink.add(new Drinks(drinkItems[2].getName(), quantity, drinkItems[2].getPrice(), tprice, qtyd[2]));
                    System.out.println(drinkItems[2].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }
                else if (choiceselect.charAt(0) == 'M' && choiceselect.charAt(choiceselect.length()-1) == 'k') {
                    System.out.println("how many pieces do you need: ");
                    quantity = in.nextInt();
                    tprice = quantity * drinkItems[3].getPrice();
                    d.qtycheck(quantity, qtyd[3]);
                    qtyd[3] = qtyd[3] - quantity;
                    drink.add(new Drinks(drinkItems[3].getName(), quantity, drinkItems[3].getPrice(), tprice, qtyd[3]));
                    System.out.println(drinkItems[3].getName() + "  " + quantity + " pieces" + "  " + tprice + "Baht");
                    amount = amount + tprice;
                    System.out.println(amount);
                }
            }
            pre=in.nextLine();
            }while (pre.charAt(pre.length()-1)==',');
            in.nextLine();
            pre=in.next();if(pre.length()==12) {pre=pre.substring(0,1);oneB = Integer.parseInt(pre);} else  if(pre.length()==13) {pre=pre.substring(0,2);oneB = Integer.parseInt(pre);}//1baht
            pre=in.next();if(pre.length()==13) {pre=pre.substring(0,1);fiveB = Integer.parseInt(pre);} else  if(pre.length()==14) {pre=pre.substring(0,2);fiveB = Integer.parseInt(pre);}//5baht
            pre=in.next();if(pre.length()==12) {pre=pre.substring(0,1);tenB = Integer.parseInt(pre);} else  if(pre.length()==13) {pre=pre.substring(0,2);tenB = Integer.parseInt(pre);}//10baht
            pre=in.next();if(pre.length()==16) {pre=pre.substring(0,1);hunB = Integer.parseInt(pre);} else  if(pre.length()==17) {pre=pre.substring(0,2);hunB = Integer.parseInt(pre);}//100baht
            // System.out.println(oneB+" "+fiveB+" "+tenB+" "+hunB);
        }
        catch (FileNotFoundException e) {
            System.out.println("input file again");
            System.exit(-1);
        }
        finally {
            in.close();
        }

        PrintWriter out = null;
        try {
            out = new PrintWriter("output.txt");
            out.println("-------------------------------------------------");
            out.println("                    Order ");
            if(food.size()>0)
            {
                out.println("Food :");
                for (int i = 0; i <food.size(); i++) {
                    out.print(food.get(i).toString()) ;
                }
                out.println();
            }
            if(drink.size()>0)
            {
                out.println("Drink :");
                for (int i = 0; i <drink.size(); i++) {
                    out.print(drink.get(i).toString());
                }
                out.println();
            }
          out.println("Total price: "+amount+" Baht");
            Change c = new Change(oneB,fiveB,tenB,hunB);
            out.println("You gave all "+c.getValue()+"Baht");
            out.println("here is your change :" + c.getChange(amount)+"Baht");
            out.println("-------------------------------------------------");
            File f2 = new File("foodoutput.txt");
            f.writeToFile(f2);
            File d2 = new File("drinkoutput.txt");
            d.writeToFile(d2);
            File c2 = new File("changeoutput.txt");
            File c3 = new File("coinoutput.txt");
            c.writeToFile(c2,c3);
        }
        catch (FileNotFoundException e) {
            System.out.println("input file again");
            System.exit(-1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            out.close();
        }

    }
}
