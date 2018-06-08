import  java.util.Scanner;

public class exerciseB001 {
        public static void main(String[] args) {

            System.out.println("Hello");
            System.out.println("Alexandra Abramov");

            Scanner input = new Scanner (System.in);
            System.out.print("Input your first name: ");
            String fname = input.next();
            System.out.print("Input your last name: ");
            String lname = input.next();
            System.out.println();
            System.out.println("Hello \n"+fname+" "+lname);
        }
    }

