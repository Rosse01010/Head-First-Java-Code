package Chapter1_Breaking_the_Surface;

public class Test {
    public static void main (String [] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x + 2;
            if ( y > 4) {
                y = y - 1;
            }
                System.out.println( x + "" + "");
                x = x + 1;

        }
    }
}
