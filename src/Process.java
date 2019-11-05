import java.util.ArrayList;
import java.util.Scanner;

class Process {
    Scanner key=new Scanner(System.in);
    Bakery bakery16=new Bakery();

    public Process() {
    }

    public void Process(ArrayList<Bakery> list,String var) {
        while(!var.equalsIgnoreCase("q")) {
            System.out.println("Welcome to the Brookley's Better Bakery App! ");
            System.out.println("We contain peanut, gluten, soy and dairy in our products.  ");
            System.out.println("To search for foods that you can eat, please enter the name of the diet restriction:  ");
            System.out.println("To see a list of all our foods, please type \"all\" or type q to Quite ");
            System.out.println();
            var = key.nextLine();
            if (!var.equalsIgnoreCase("all")) {
                for (Bakery h : list) {
                    if (var.equalsIgnoreCase(h.getRestrictions())) {
                        h.getDisplayText();
                        System.out.println();
                    }
                }
            } else {
                for (Bakery h : list) {

                    h.getDisplayText();
                    System.out.println();

                }

            }
        }
    }


}
