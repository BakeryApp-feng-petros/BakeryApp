import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     String answer="";
        ArrayList<Bakery> booklist=new ArrayList<>();
        Bakery bakery1=new Bakery("BANANA BREAD","12/1/2019",15,new ArrayList<>(Arrays.asList("gluten free", "soy free")), true);
        Bakery bakery2=new Bakery("white bread","12/12/2019",14,new ArrayList<>(Arrays.asList("gluten free", "egg free")),true);
        Bakery bakery3=new Bakery("HAMBURGER BUNS","12/5/2019",12,new ArrayList<>(Arrays.asList("egg free", "soy free")),true);
        Bakery bakery4=new Bakery("CINNAMON BREAD","12/8/2019",16,new ArrayList<>(Arrays.asList("egg free", "soy free")),true);
        Bakery bakery5=new Bakery("Apple BREAD","12/8/2019",15,new ArrayList<>(Arrays.asList("gluten free", "soy free")),true);
        Bakery bakery6=new Bakery("pizza crust","12/8/2019",15,new ArrayList<>(Arrays.asList("egg free", "soy free")),true);
        Bakery bakery7=new Bakery("savor BREAD","12/8/2019",15,new ArrayList<>(Arrays.asList("gluten free", "egg free")),true);
        Bakery bakery8=new Bakery("muffins", "12/12/2019",12,new ArrayList<>(Arrays.asList("gluten free", "soy free")),true);
        Bakery bakery9=new Bakery("bread pudding","12/14/2019", 10,new ArrayList<>(Arrays.asList("gluten free", "egg free")),true);
        Bakery bakery10=new Bakery("fruit cake","12/5/2019",13,new ArrayList<>(Arrays.asList("peanut free", "soy free")),false);
        Bakery bakery11=new Bakery("Empanadas","12/4/2019",10,new ArrayList<>(Arrays.asList("gluten free", "peanut free")),true);
        Bakery bakery12=new Bakery("Strawberry Cake", "12/4/2019",19,new ArrayList<>(Arrays.asList("gluten free", "egg free")),true);
        Bakery bakery13=new Bakery("Golf Cart Cake","12/1/2019",12,new ArrayList<>(Arrays.asList("gluten free", "nuts free")),true);
        Bakery bakery14=new Bakery("Baseball Cake","12/25/2019",10,new ArrayList<>(Arrays.asList("gluten free", "soy free")),true);
        Bakery bakery15=new Bakery("Dinosaur Volcano","12/26/2019",23,new ArrayList<>(Arrays.asList("gluten free", "soy free")), true);
        Collections.addAll(booklist,bakery1,bakery2,bakery3,bakery4,bakery5,bakery6,bakery7,bakery8,bakery9,bakery10,bakery11,bakery12,bakery13,bakery14,bakery15);
        Process newObj=new Process();
        newObj.Process(booklist,answer);

    }




}
