import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoVM {

    public static void main(String[] args)  {
        int quantity,choiceselect ;
        double tprice = 0.0;
        char choicedo = '\0';
        double amount=0; String pre;
        int oneB,fiveB,tenB,hunB;
        int[]  qtyf = new int[4]; int countfood=0;
        int[]  qtyd = new int[4]; int countdrink=0;

        Food f = new Food();
        Food[] foodItems = f.getItems();

        Drinks d =new Drinks();
        Drinks[] drinkItems = d.getItems();

        ArrayList<Food> food = new ArrayList<Food>();
        ArrayList<Drinks> drink = new ArrayList<Drinks>();

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our Vending Machine");
        do {
            System.out.println("You want to add food(1) or drinks(2)");
            choiceselect=in.nextInt();
            if(choiceselect==1){
              System.out.println("Here are our foods");
                for (int i = 0; i <foodItems.length; i++) {
                    if(countfood==0){
                        qtyf[i]=foodItems[i].getTotalqty();
                    }
                }
                countfood++;
                for (int i = 0; i <foodItems.length; i++) {
                    System.out.format("Enter %d for %-9s %12.2f Baht %5d pieces left \n", i+1,foodItems[i].getName(), foodItems[i].getPrice(), qtyf[i]);
                }
                choiceselect=in.nextInt()-1;
                for(int i=0;i<=choiceselect;i++)
                {
                    if(i==choiceselect)
                    {
                        System.out.println("how many pieces do you need: ");
                        quantity=in.nextInt();
                        tprice=quantity*foodItems[i].getPrice();
                        f.qtycheck(quantity,qtyf[i]);
                        qtyf[i]=qtyf[i]-quantity;
                        f.compareTo(d);
                        food.add( new Food(foodItems[i].getName(),quantity,foodItems[i].getPrice(),tprice, qtyf[i]));
                        System.out.println(foodItems[i].getName()+"  "+quantity+" pieces"+"  "+tprice+"Baht");
                        amount=amount+tprice;
                    }
                }
            }
            else if(choiceselect==2){
                System.out.println("Here are our drinks");
                for (int i = 0; i <drinkItems.length; i++) {
                    if(countdrink==0){
                        qtyd[i]=drinkItems[i].getTotalqty();
                    }
                }
                countdrink++;
                for (int i = 0; i <drinkItems.length; i++) {
                    System.out.format("Enter %d for %-9s %12.2f Baht %5d pieces left \n", i+1,drinkItems[i].getName(), drinkItems[i].getPrice(), qtyd[i]);
                }
                choiceselect=in.nextInt()-1;
                for(int i=0;i<=choiceselect;i++)
                {
                    if(i==choiceselect)
                    {
                        System.out.println("how many pieces do you need: ");
                        quantity=in.nextInt();
                        tprice=quantity*drinkItems[i].getPrice();
                        d.qtycheck(quantity,qtyd[i]);
                        qtyd[i]=qtyd[i]-quantity;
                        d.compareTo(f);
                        drink.add( new Drinks(drinkItems[i].getName(),quantity,drinkItems[i].getPrice(),tprice,qtyd[i]));
                        System.out.println(drinkItems[i].getName()+"  "+quantity+" pieces"+"  "+tprice+"Baht");
                        amount=amount+tprice;
                    }
                }
            }
            System.out.println("want to add more product to cart? (type y or n): ");
            choicedo = in.next().charAt(0);
           in.nextLine();
        } while (choicedo == 'y');
        System.out.println("-------------------------------------------------");
        System.out.println("                    Order ");
        if(food.size()>0)
        {
            System.out.println("Food :");
            for (int i = 0; i <food.size(); i++) {
                food.get(i).display();
            }
        }
        if(drink.size()>0)
        {
            System.out.println("Drink :");
            for (int i = 0; i <drink.size(); i++) {
                drink.get(i).display();
            }
        }
        System.out.println("Total Price :"+amount);
        System.out.println("-------------------------------------------------");
        System.out.println(" Enter coins as follows: ");
        System.out.println(" How many coins do you want to put in (1Baht 5Baht 10Baht 100Baht)");
        System.out.println(" Ex. if you want 2 coin of ten Baht to pay = 0 0 2 0  ");
        pre=in.next(); oneB = Integer.parseInt(pre);
        pre=in.next(); fiveB = Integer.parseInt(pre);
        pre=in.next(); tenB = Integer.parseInt(pre);
        pre=in.next(); hunB = Integer.parseInt(pre);
        Change c = new Change(oneB,fiveB,tenB,hunB);
        c.checkChange(amount);
    }
}

