package Vektor.src.minPakke;

public class Vektor {
    public static void main (String[] args){

        for (double x = -2; x < 3; x++) {
            for (double y = -2; y < 3; y++) {
                Matematik matA = new Matematik();
                matA.beregnLaengde(x, y);
                matA.skrivLaengde();
            }
        }
    }
}