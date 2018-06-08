public class cwiczenie003 {
    public static void main(String[] args){


        System.out.println( GoodBusiness( 24, 12 ));
        System.out.println( GoodBusiness( 24, 13 ));
        System.out.println( GoodBusiness( 24, 14 ));
        System.out.println( GoodBusiness( 24, 15 ));
    }

    public static String GoodBusiness( double srednica , double cena) {
       // double iloraz;
double iloraz = 0 ;

        if (cena != 0 ) {
            iloraz = srednica / cena;
        }

        return  "Opłacalność: " + iloraz;
    }

}
