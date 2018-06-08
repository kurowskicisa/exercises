public class cwiczenie004 {
    public static void main (String[] args){
        System.out.println( firstLetterofStting ("Imię i nazwisko"));
        System.out.println( firstLetterofStting ("Adam"));
        System.out.println( firstLetterofStting ("Ewa"));
    }


    public static String firstLetterofStting (String text) {
        char fl;


        fl = text.charAt(0);

        return text + " - " + fl;

    }


}
