

public class cwiczenie002 {
    public static void main(String[] args){
        System.out.println( add(5,4) );
        System.out.println( substract (4,5) );
        System.out.println( divide(1,2));
        System.out.println( divide(10,2));
        System.out.println( divide(10,3 ));
        System.out.println( divide(10, 4 ));
        System.out.println( divide(10,5 ));
        System.out.println( divide(10,6 ));
        System.out.println( divide(10, 7));
        System.out.println( divide(10,8 ));
        System.out.println( divide(10,9 ));
        System.out.println( divide(10,10));
        System.out.println ( divide(2, 0));
        System.out.println ( multiply( 4,3 ));

    }


    public static int add(int a, int b) {
        int sum;

        sum = a+b;

        return sum;
    }

    public static int substract(int a, int b){
        int difference;

        difference = a-b;

        return difference;
    }


    public static String  divide(int a, int b){
        double iloraz;

        if ( b != 0 ) {
            iloraz = a / b;

            return "Dzielenie: " + a + " podzielone przez " + b + " daje w wyniku: " + iloraz;
        }

        else {

            return "Dzielenie: " + a + " podzielone przez " + b + " daje w wyniku:  brak rozwiązania (dzielenie przez zero)";
        }
    }

    public static String  divideDouble(double a, double b){
        double iloraz;

        if ( b != 0 ) {
            iloraz = a / b;

            return "Dzielenie: " + a + " podzielone przez " + b + " daje w wyniku: " + iloraz;
        }

        else {

            return "Dzielenie: " + a + " podzielone przez " + b + " daje w wyniku:  brak rozwiązania (dzielenie przez zero)";
        }
    }

    public static String multiply(int a, int b) {
        int iloczyn;

        iloczyn = a*b;

        return "Mnżenie: "+ a + " razy " + b + " = " + iloczyn;
    }
}
