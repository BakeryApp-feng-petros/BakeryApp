import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner key=new Scanner(System.in);
     String answer="";
        ArrayList<Bakery> booklist=new ArrayList<>();
        Bakery bakery1=new Bakery("BANANA BREAD","12/1/2019",15,"gluten free",true);
        booklist.add(bakery1);

        Bakery bakery2=new Bakery("white bread","12/12/2019",14,"dairy free",true);

        booklist.add(bakery2);

        Bakery bakery3=new Bakery("HAMBURGER BUNS","12/5/2019",12,"egg free",true);

        booklist.add(bakery3);

        Bakery bakery4=new Bakery("CINNAMON BREAD","12/8/2019",16,"soy free",true);

        booklist.add(bakery4);

        Bakery bakery5=new Bakery("Apple BREAD","12/8/2019",15,"gluten free",true);
        booklist.add(bakery5);


        Bakery bakery6=new Bakery("pizza crust","12/8/2019",15,"egg free",true);
        booklist.add(bakery6);

        Bakery bakery7=new Bakery("savor BREAD","12/8/2019",15,"dairy free",true);
        booklist.add(bakery7);

        Bakery bakery8=new Bakery("muffins", "12/12/2019",12,"dairy free",true);
        booklist.add(bakery8);

        Bakery bakery9=new Bakery("bread pudding","12/14/2019", 10,"peanut free",true);
        booklist.add(bakery9);

        Bakery bakery10=new Bakery("fruit cake","12/5/2019",13,"gluten free",false);
        booklist.add(bakery10);

        Bakery bakery11=new Bakery("Empanadas","12/4/2019",10,"gluten free",true);
        booklist.add(bakery11);

        Bakery bakery12=new Bakery("Strawberry Cake", "12/4/2019",19,"gluten free",true);
        booklist.add(bakery12);

        Bakery bakery13=new Bakery("Golf Cart Cake","12/1/2019",12,"gluten free",true);
        booklist.add(bakery13);

        Bakery bakery14=new Bakery("Baseball Cake","12/25/2019",10,"dairy free",true);
        booklist.add(bakery14);

        Bakery bakery15=new Bakery("Dinosaur Volcano","12/26/2019",23,"peanut free", true);
        booklist.add(bakery15);


        Process newObj=new Process();
        newObj.Process(booklist,answer);

    }




}
