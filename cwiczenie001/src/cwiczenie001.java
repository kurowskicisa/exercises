import java.util.Scanner;

public class cwiczenie001 {
   public static void main(String [] args){

       Scanner argument1 = new Scanner(System.in);
       Scanner argument2 = new Scanner(System.in);
       System.out.println("Podaj pierwszy argment dodawania:");
       int add1 = argument1.nextInt();
       System.out.println("Podaj drugi argument dodawania:");
       int add2 = argument2.nextInt();
       System.out.println( ( add1 + add2) );
    }
}
