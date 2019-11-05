import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner key=new Scanner(System.in);

        ArrayList<Bakery> booklist=new ArrayList<>();
        Bakery bakery1=new Bakery();
        bakery1.setName("BANANA BREAD");
        bakery1.setExpirationDate("12/1/2019");
        bakery1.setPrice(15);
        bakery1.setRestrictions("gluten free");
        bakery1.getIsInStock(true);
        booklist.add(bakery1);

        Bakery bakery2=new Bakery();
        bakery2.setName("white bread");
        bakery2.setExpirationDate("12/12/2019");
        bakery2.setPrice(14);
        bakery2.setRestrictions("dairy free");
        bakery2.getIsInStock(true);
        booklist.add(bakery2);

        Bakery bakery3=new Bakery();
        bakery3.setName("HAMBURGER BUNS");
        bakery3.setExpirationDate("12/5/2019");
        bakery3.setPrice(12);
        bakery3.setRestrictions("egg free");
        bakery3.getIsInStock(true);
        booklist.add(bakery3);

        Bakery bakery4=new Bakery();
        bakery4.setName("CINNAMON BREAD");
        bakery4.setExpirationDate("12/8/2019");
        bakery4.setPrice(16);
        bakery4.setRestrictions("soy free");
        bakery4.getIsInStock(true);
        booklist.add(bakery4);

        Bakery bakery5=new Bakery();
        bakery5.setName("Apple BREAD");
        bakery5.setExpirationDate("12/8/2019");
        bakery5.setPrice(15);
        bakery5.setRestrictions("gluten free");
        bakery5.getIsInStock(true);
        booklist.add(bakery5);


        Bakery bakery6=new Bakery();
        bakery6.setName("pizza crust");
        bakery6.setExpirationDate("12/8/2019");
        bakery6.setPrice(15);
        bakery6.setRestrictions("egg free");
        bakery6.getIsInStock(true);
        booklist.add(bakery6);

        Bakery bakery7=new Bakery();
        bakery7.setName("savor BREAD");
        bakery7.setExpirationDate("12/8/2019");
        bakery7.setPrice(15);
        bakery7.setRestrictions("dairy free");
        bakery7.getIsInStock(true);
        booklist.add(bakery7);

        Bakery bakery8=new Bakery();
        bakery8.setName("muffins");
        bakery8.setExpirationDate("12/12/2019");
        bakery8.setPrice(12);
        bakery8.setRestrictions("dairy free");
        bakery8.getIsInStock(true);
        booklist.add(bakery8);

        Bakery bakery9=new Bakery();
        bakery9.setName("bread pudding");
        bakery9.setExpirationDate("12/14/2019");
        bakery9.setPrice(10);
        bakery9.setRestrictions("peanut free");
        bakery9.getIsInStock(true);
        booklist.add(bakery9);

        Bakery bakery10=new Bakery();
        bakery10.setName("fruit cake");
        bakery10.setExpirationDate("12/5/2019");
        bakery10.setPrice(13);
        bakery10.setRestrictions("gluten free");
        bakery10.getIsInStock(false);
        booklist.add(bakery10);

        Bakery bakery11=new Bakery();
        bakery11.setName("Empanadas");
        bakery11.setExpirationDate("12/4/2019");
        bakery11.setPrice(10);
        bakery11.setRestrictions("gluten free");
        bakery11.getIsInStock(true);
        booklist.add(bakery11);

        Bakery bakery12=new Bakery();
        bakery12.setName("Strawberry Cake");
        bakery12.setExpirationDate("12/4/2019");
        bakery12.setPrice(19);
        bakery12.setRestrictions("gluten free");
        bakery12.getIsInStock(true);
        booklist.add(bakery12);

        Bakery bakery13=new Bakery();
        bakery13.setName("Golf Cart Cake");
        bakery13.setExpirationDate("12/1/2019");
        bakery13.setPrice(12);
        bakery13.setRestrictions("gluten free");
        bakery13.getIsInStock(true);
        booklist.add(bakery13);

        Bakery bakery14=new Bakery();
        bakery14.setName("Baseball Cake");
        bakery14.setExpirationDate("12/25/2019");
        bakery14.setPrice(10);
        bakery14.setRestrictions("dairy free");
        bakery14.getIsInStock(true);
        booklist.add(bakery14);

        Bakery bakery15=new Bakery();
        bakery15.setName("Dinosaur Volcano");
        bakery15.setExpirationDate("12/26/2019");
        bakery15.setPrice(23);
        bakery15.setRestrictions("peanut free");
        bakery15.getIsInStock(true);
        booklist.add(bakery15);

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
