import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner key=new Scanner(System.in);

        ArrayList<Bakery> booklist=new ArrayList<>();
        Bakery bakery1=new Bakery();
        bakery1.setName("BANANA BREAD");
        bakery1.setExpirationDate(12/8/2015);
        bakery1.setPrice(15);
        bakery1.setRestrictions("gluten free");
        bakery1.getIsInStock(true);
        booklist.add(bakery1);

        Bakery bakery2=new Bakery();
        bakery2.setName("white bread");
        bakery2.setExpirationDate(1 / 2015);
        bakery2.setPrice(14);
        bakery2.setRestrictions("diary free");
        bakery2.getIsInStock(true);
        booklist.add(bakery2);

        Bakery bakery3=new Bakery();
        bakery3.setName("HAMBURGER BUNS");
        bakery3.setExpirationDate(28/5/2015);
        bakery3.setPrice(12);
        bakery3.setRestrictions("egg free");
        bakery3.getIsInStock(true);
        booklist.add(bakery3);

        Bakery bakery4=new Bakery();
        bakery4.setName("CINNAMON BREAD");
        bakery4.setExpirationDate(12/8/2015);
        bakery4.setPrice(16);
        bakery4.setRestrictions("soy free");
        bakery4.getIsInStock(true);
        booklist.add(bakery4);

        Bakery bakery5=new Bakery();
        bakery5.setName("Apple BREAD");
        bakery5.setExpirationDate(12/8/2015);
        bakery5.setPrice(15);
        bakery5.setRestrictions("gluten free");
        bakery5.getIsInStock(true);
        booklist.add(bakery5);


        Bakery bakery6=new Bakery();
        bakery6.setName("pizza crust");
        bakery6.setExpirationDate(12/8/2015);
        bakery6.setPrice(15);
        bakery6.setRestrictions("egg free");
        bakery6.getIsInStock(true);
        booklist.add(bakery6);

        Bakery bakery7=new Bakery();
        bakery7.setName("savor BREAD");
        bakery7.setExpirationDate(12/8/2015);
        bakery7.setPrice(15);
        bakery7.setRestrictions("diary free");
        bakery7.getIsInStock(true);
        booklist.add(bakery7);
    System.out.println("Welcome to the Brookley's Better Bakery App! ");
    System.out.println("We contain peanut, gluten, soy and dairy in our products.  ");
    System.out.println("To search for foods that you can eat, please enter the name of the diet restriction:  ");
    System.out.println("To see a list of all our foods, please type \"all\". ");
    String answer=key.nextLine();

   for(Bakery h:booklist){
       if(answer.equalsIgnoreCase(h.getRestrictions())){
           h.getDisplayText();
           System.out.println(answer);
       }
       System.out.println(" ");
   }

    }




}
